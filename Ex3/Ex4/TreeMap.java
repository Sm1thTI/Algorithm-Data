package Ex4;

public class TreeMap<K extends Comparable<K>, V> {
    class Node {
        K key;
        V value;
        Node left, right;

        Node(K k, V v) {
            key = k;
            value = v;
        }
    }

    private Node root;
    private int size = 0;

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    // ---------- GET ----------
    public V get(K key) {
        Node n = root;
        while (n != null) {
            int cmp = key.compareTo(n.key);
            if (cmp == 0) return n.value;
            else if (cmp < 0) n = n.left;
            else n = n.right;
        }
        return null;
    }

    // ---------- PUT ----------
    public V put(K key, V value) {
        root = put(root, key, value);
        return value;
    }

    private Node put(Node n, K key, V value) {
        if (n == null) {
            size++;
            return new Node(key, value);
        }
        int cmp = key.compareTo(n.key);
        if (cmp == 0) n.value = value;
        else if (cmp < 0) n.left = put(n.left, key, value);
        else n.right = put(n.right, key, value);
        return n;
    }

    // ---------- REMOVE ----------
    public void remove(K key) {
        root = remove(root, key);
    }

    private Node remove(Node n, K key) {
        if (n == null) return null;

        int cmp = key.compareTo(n.key);
        if (cmp < 0) n.left = remove(n.left, key);
        else if (cmp > 0) n.right = remove(n.right, key);
        else {
            // Case 1: no children
            if (n.left == null && n.right == null) {
                size--;
                return null;
            }
            // Case 2: one child
            else if (n.left == null) {
                size--;
                return n.right;
            }
            else if (n.right == null) {
                size--;
                return n.left;
            }
            // Case 3: two children → replace with inorder successor
            else {
                Node successor = min(n.right);
                n.key = successor.key;
                n.value = successor.value;
                n.right = remove(n.right, successor.key);
            }
        }
        return n;
    }

    private Node min(Node n) {
        while (n.left != null) n = n.left;
        return n;
    }
}

