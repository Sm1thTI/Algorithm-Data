package BTN;

public interface Graph<V, E> {
    int numVertices();
    int numEdges();
    Iterable<Vertex<V>> vertices();
    Iterable<Edge<E>> edges();
    Vertex<V> insertVertex(V element);
    Edge<E> insertEdge(Vertex<V> u, Vertex<V> v, E element);
    Iterable<Edge<E>> outgoingEdges(Vertex<V> v);
    Vertex<V> opposite(Vertex<V> v, Edge<E> e);
    Edge<E> getEdge(Vertex<V> u, Vertex<V> v);
    Vertex<V>[] endVertices(Edge<E> e);
}