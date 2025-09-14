package Ex3;

import java.util.ArrayList;
import java.util.Map;

public class ProbeHashMap_Advance<K, V> extends AbstractHashMap<K, V> {
    public enum ProbingStrategy {
        LINEAR,
        QUADRATIC,
        DOUBLE_HASH
    }
    private ProbingStrategy strategy = ProbingStrategy.LINEAR;

    public ProbeHashMap_Advance(int cap, int p, ProbingStrategy strategy) {
        super(cap, p);
        this.strategy = strategy;
    }

    private int secondaryHash(K key) {
        int h2 = key.hashCode() % (capacity - 2);
        if (h2 < 0) h2 += (capacity - 2);
        return 1 + h2;  // ensure not 0
    }

    // ---------------- nested MapEntry class ----------------
    protected static class MapEntry<K, V> implements Map.Entry<K, V>, Entry<K, V> {
        private K key;
        private V value;

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V v) {
            V old = value;
            value = v;
            return old;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    // -------------------------------------------------------
    private MapEntry<K, V>[] table;                 // fixed array of entries
    private final MapEntry<K, V> DEFUNCT = new MapEntry<>(null, null); // sentinel

    // ---------------- constructors ----------------
    public ProbeHashMap_Advance() {
        super();
    }

    public ProbeHashMap_Advance(int cap) {
        super(cap);
    }

    public ProbeHashMap_Advance(int cap, int p) {
        super(cap, p);
    }

    /**
     * Creates an empty table having length equal to current capacity.
     */
    @SuppressWarnings("unchecked")
    @Override
    protected void createTable() {
        table = (MapEntry<K, V>[]) new MapEntry[capacity];
    }

    /**
     * Returns true if location is either empty or the "defunct" sentinel.
     */
    private boolean isAvailable(int j) {
        return (table[j] == null || table[j] == DEFUNCT);
    }

    /**
     * Returns index with key k, or −(a+1) such that k could be added at index a.
     */
    private int findSlot(int h, K k) {
        int avail = -1;
        int step = 1;                    // for quadratic/double hashing
        int j = h;
        int h2 = (strategy == ProbingStrategy.DOUBLE_HASH) ? secondaryHash(k) : 0;
        int i = 0;

        do {
            if (isAvailable(j)) {
                if (avail == -1) avail = j;
                if (table[j] == null) break;
            } else if (table[j].getKey().equals(k)) {
                return j;                // found key
            }

            i++;
            switch (strategy) {
                case LINEAR -> j = (h + i) % capacity;
                case QUADRATIC -> j = (h + i * i) % capacity;
                case DOUBLE_HASH -> j = (h + i * h2) % capacity;
            }
        } while (j != h);

        return -(avail + 1);
    }


    /**
     * Returns value associated with key k, or else null.
     */
    @Override
    protected V bucketGet(int h, K k) {
        int j = findSlot(h, k);
        if (j < 0) return null;       // no match found
        return table[j].getValue();
    }

    /**
     * Associates key k with value v; returns old value.
     */
    @Override
    protected V bucketPut(int h, K k, V v) {
        int j = findSlot(h, k);
        if (j >= 0) {                 // key already present
            return table[j].setValue(v);
        }
        table[-(j + 1)] = new MapEntry<>(k, v); // convert to proper index
        n++;
        return null;
    }

    /**
     * Removes entry having key k, if any.
     */
    @Override
    protected V bucketRemove(int h, K k) {
        int j = findSlot(h, k);
        if (j < 0) return null;       // nothing to remove
        V answer = table[j].getValue();
        table[j] = DEFUNCT;           // mark slot as deactivated
        n--;
        return answer;
    }

    /**
     * Returns an iterable collection of all key-value entries.
     */
    @Override
    public Iterable<Entry<K, V>> entrySet() {
        ArrayList<Entry<K, V>> buffer = new ArrayList<>();
        if (table != null) {
            for (int j = 0; j < capacity; j++) {
                if (table[j] != null && table[j] != DEFUNCT) {
                    buffer.add(table[j]); // no cast needed if types match
                }
            }
        }
        return buffer;
    }
}
