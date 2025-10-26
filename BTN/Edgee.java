package BTN;

public class Edgee<E> { // Renamed from Edge

    private final E element;
    private final Vertex<String> origin;
    private final Vertex<String> destination;

    public Edgee(Vertex<String> u, Vertex<String> v, E element) { // Renamed constructor
        this.origin = u;
        this.destination = v;
        this.element = element;
    }

    public Vertex<String> getOrigin() {
        return origin;
    }

    public Vertex<String> getDestination() {
        return destination;
    }

    public E getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "(" + origin.toString() + " → " + destination.toString() + ")";
    }
}