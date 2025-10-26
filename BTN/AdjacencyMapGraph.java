package BTN;

import java.util.*;

public class AdjacencyMapGraph<V,E> implements Graph<V,E> {
    private final boolean directed;
    private final Set<InnerVertex<V,E>> vertexSet = new LinkedHashSet<>();
    private final Set<InnerEdge<V,E>> edgeSet = new LinkedHashSet<>();

    // --- Nested InnerVertex Class ---
    private static class InnerVertex<V,E> implements Vertex<V> {
        private final V element;
        private final Map<InnerVertex<V,E>, InnerEdge<V,E>> outgoing = new HashMap<>();
        private final Map<InnerVertex<V,E>, InnerEdge<V,E>> incoming = new HashMap<>();

        InnerVertex(V elem) { this.element = elem; }

        public V getElement() { return element; }
        Map<InnerVertex<V,E>, InnerEdge<V,E>> getOutgoing() { return outgoing; }
        Map<InnerVertex<V,E>, InnerEdge<V,E>> getIncoming() { return incoming; }

        @Override
        public String toString() { return String.valueOf(element); }
    }

    // --- Nested InnerEdge Class ---
    private static class InnerEdge<V,E> implements Edge<E> {
        private final InnerVertex<V,E> u, v;
        private final E element;

        InnerEdge(InnerVertex<V,E> u, InnerVertex<V,E> v, E elem) {
            this.u = u;
            this.v = v;
            this.element = elem;
        }

        public E getElement() { return element; }
        InnerVertex<V,E> getU() { return u; }
        InnerVertex<V,E> getV() { return v; }

        @Override
        public String toString() { return "(" + u + " → " + v + ")"; }
    }

    public AdjacencyMapGraph(boolean directed) {
        this.directed = directed;
    }

    // --- Validation Methods ---
    private InnerVertex<V,E> validate(Vertex<V> v) {
        if (!(v instanceof InnerVertex)) throw new IllegalArgumentException("Invalid vertex");
        InnerVertex<V,E> iv = (InnerVertex<V,E>) v; // Safe cast
        if (!vertexSet.contains(iv)) throw new IllegalArgumentException("Vertex does not belong to this graph");
        return iv;
    }

    private InnerEdge<V,E> validate(Edge<E> e) {
        if (!(e instanceof InnerEdge)) throw new IllegalArgumentException("Invalid edge");
        InnerEdge<V,E> ie = (InnerEdge<V,E>) e; // Safe cast
        if (!edgeSet.contains(ie)) throw new IllegalArgumentException("Edge does not belong to this graph");
        return ie;
    }

    public int numVertices() { return vertexSet.size(); }
    public int numEdges() { return edgeSet.size(); }

    public Iterable<Vertex<V>> vertices() {
        return Collections.unmodifiableSet(new LinkedHashSet<>(vertexSet));
    }

    public Iterable<Edge<E>> edges() {
        return Collections.unmodifiableSet(new LinkedHashSet<>(edgeSet));
    }

    public int outDegree(Vertex<V> v) {
        return validate(v).getOutgoing().size();
    }

    public int inDegree(Vertex<V> v) {
        return validate(v).getIncoming().size();
    }

    public Iterable<Edge<E>> outgoingEdges(Vertex<V> v) {
        InnerVertex<V,E> iv = validate(v);
        return Collections.unmodifiableCollection(iv.getOutgoing().values());
    }

    public Iterable<Edge<E>> incomingEdges(Vertex<V> v) {
        InnerVertex<V,E> iv = validate(v);
        return Collections.unmodifiableCollection(iv.getIncoming().values());
    }

    public Edge<E> getEdge(Vertex<V> u, Vertex<V> v) {
        InnerVertex<V,E> uu = validate(u);
        return uu.getOutgoing().get(validate(v));
    }

    public Vertex<V>[] endVertices(Edge<E> e) {
        InnerEdge<V,E> ie = validate(e);
        Vertex<V>[] endpoints = (Vertex<V>[]) new Vertex[]{ie.getU(), ie.getV()};
        return endpoints;
    }

    public Vertex<V> opposite(Vertex<V> v, Edge<E> e) {
        InnerVertex<V,E> iv = validate(v);
        InnerEdge<V,E> ie = validate(e);
        if (ie.getU() == iv) return ie.getV();
        if (ie.getV() == iv) return ie.getU();
        throw new IllegalArgumentException("Edge is not incident to this vertex");
    }

    public Vertex<V> insertVertex(V element) {
        InnerVertex<V,E> v = new InnerVertex<>(element);
        vertexSet.add(v);
        return v;
    }

    public Edge<E> insertEdge(Vertex<V> u, Vertex<V> v, E element) {
        InnerVertex<V,E> uu = validate(u);
        InnerVertex<V,E> vv = validate(v);

        if (getEdge(uu, vv) != null) {
            throw new IllegalArgumentException("Edge from " + u + " to " + v + " already exists");
        }

        InnerEdge<V,E> e = new InnerEdge<>(uu, vv, element);
        uu.getOutgoing().put(vv, e);
        vv.getIncoming().put(uu, e);
        if (!directed) {
            vv.getOutgoing().put(uu, e);
            uu.getIncoming().put(vv, e);
        }
        edgeSet.add(e);
        return e;
    }

    public V removeVertex(Vertex<V> v) {
        InnerVertex<V,E> iv = validate(v);
        List<Edge<E>> edgesToRemove = new ArrayList<>();
        edgesToRemove.addAll(iv.getOutgoing().values());
        edgesToRemove.addAll(iv.getIncoming().values());

        for (Edge<E> e : edgesToRemove) {
            if (edgeSet.contains(e)) {
                removeEdge(e);
            }
        }

        vertexSet.remove(iv);
        return iv.getElement();
    }

    public E removeEdge(Edge<E> e) {
        InnerEdge<V,E> ie = validate(e);
        InnerVertex<V,E> u = ie.getU();
        InnerVertex<V,E> v = ie.getV();

        u.getOutgoing().remove(v);
        v.getIncoming().remove(u);
        if (!directed) {
            v.getOutgoing().remove(u);
            u.getIncoming().remove(v);
        }

        edgeSet.remove(ie);
        return ie.getElement();
    }

}