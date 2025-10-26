package BTN;

import java.util.Map;

public class GraphUtils {

    public static <V, E> void copyVertices(Graph<V, E> oldGraph, Graph<V, E> newGraph, Map<V, Vertex<V>> map) {
        for (Vertex<V> oldV : oldGraph.vertices()) {
            V element = oldV.getElement();
            if (!map.containsKey(element)) {
                Vertex<V> newV = newGraph.insertVertex(element);
                map.put(element, newV); // Store it in the map
            }
        }
    }

    public static <V, E> void copyEdges(Graph<V, E> oldGraph, Graph<V, E> newGraph, Map<V, Vertex<V>> map) {
        for (Edge<E> oldE : oldGraph.edges()) {
            Vertex<V>[] oldEndpoints = oldGraph.endVertices(oldE);
            Vertex<V> oldU = oldEndpoints[0];
            Vertex<V> oldV = oldEndpoints[1];

            Vertex<V> newU = map.get(oldU.getElement());
            Vertex<V> newV = map.get(oldV.getElement());

            try {
                if (newGraph.getEdge(newU, newV) == null) {
                    newGraph.insertEdge(newU, newV, oldE.getElement());
                }
            } catch (Exception e) {
                System.out.println("Error adding edge: " + e.getMessage());
            }
        }
    }
}