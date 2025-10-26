package BTN;

import java.util.*;
import java.util.function.Function;

public class ShortestPath {

    static class Entry<V> implements Comparable<Entry<V>> {
        Vertex<V> vertex;
        int distance;

        Entry(Vertex<V> v, int d) {
            this.vertex = v;
            this.distance = d;
        }

        @Override
        public int compareTo(Entry<V> other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public static <V, E> void FindShort(Graph<V, E> g, Vertex<V> start,
                                        Map<Vertex<V>, Integer> dist,
                                        Map<Vertex<V>, Edge<E>> predecessors,
                                        Function<E, Integer> getWeight) {

        for (Vertex<V> v : g.vertices()) {
            dist.put(v, Integer.MAX_VALUE);
        }
        dist.put(start, 0);

        PriorityQueue<Entry<V>> pq = new PriorityQueue<>();
        pq.add(new Entry<>(start, 0));

        while (!pq.isEmpty()) {
            Entry<V> entry = pq.poll();
            Vertex<V> u = entry.vertex;
            int d = entry.distance;

            if (d > dist.get(u)) {
                continue;
            }

            for (Edge<E> e : g.outgoingEdges(u)) {
                Vertex<V> v = g.opposite(u, e);

                // Use the provided function to get the weight
                int weight = getWeight.apply(e.getElement());

                if (dist.get(u) == Integer.MAX_VALUE) {
                    continue;
                }

                if (dist.get(u) + weight < dist.get(v)) {
                    int newDist = dist.get(u) + weight;
                    dist.put(v, newDist);
                    predecessors.put(v, e);
                    pq.add(new Entry<>(v, newDist));
                }
            }
        }
    }

    public static <V, E> List<Edge<E>> getPath(Graph<V, E> g, Vertex<V> start, Vertex<V> end,
                                               Map<Vertex<V>, Edge<E>> predecessors) {

        List<Edge<E>> path = new ArrayList<>();

        if (predecessors.get(end) == null && !end.equals(start)) {
            return null; // No path found
        }

        Vertex<V> curr = end;

        while (curr != null && !curr.equals(start)) {
            Edge<E> edge = predecessors.get(curr);
            if (edge == null) break;

            path.add(edge);
            curr = g.opposite(curr, edge);
        }

        Collections.reverse(path);
        return path;
    }
}