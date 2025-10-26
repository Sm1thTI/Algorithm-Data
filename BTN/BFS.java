package BTN;

import java.util.*;

public class BFS {

    public static <V, E> void bfs(Graph<V, E> g, Vertex<V> s,
                                  Set<Vertex<V>> known,
                                  Map<Vertex<V>, Edge<E>> forest) {

        Queue<Vertex<V>> queue = new LinkedList<>();

        known.add(s);
        queue.add(s);

        while (!queue.isEmpty()) {
            Vertex<V> u = queue.remove();
            for (Edge<E> e : g.outgoingEdges(u)) {
                Vertex<V> v = g.opposite(u, e);
                if (!known.contains(v)) {
                    known.add(v);
                    forest.put(v, e);
                    queue.add(v);
                }
            }
        }
    }

    public static <V, E> List<Edge<E>> getPathFromForest(Graph<V, E> g, Vertex<V> start, Vertex<V> end,
                                                         Map<Vertex<V>, Edge<E>> forest) {
        List<Edge<E>> path = new ArrayList<>();
        if (forest.get(end) == null && end != start) {
            return null; // No path
        }

        Vertex<V> curr = end;
        while (curr != start) {
            Edge<E> edge = forest.get(curr);
            if (edge == null) break;
            path.add(edge);
            curr = g.opposite(curr, edge);
        }
        Collections.reverse(path);
        return path;
    }
}