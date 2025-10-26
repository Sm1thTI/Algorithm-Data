package BTN;

class Entry<V> implements Comparable<Entry<V>> {
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
