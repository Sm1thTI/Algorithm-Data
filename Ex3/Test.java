package Ex3;

public class Test {
    public static void main(String[] args) {
        // Create a ProbeHashMap with capacity 11
        ProbeHashMap<Integer, String> map = new ProbeHashMap<>(11);

        System.out.println("=== Inserting Entries ===");
        map.put(22, "A");
        map.put(33, "B");
        map.put(4,  "C");
        map.put(15, "D");
        map.put(26, "E");
        map.put(37, "F");

        printMap(map);

        System.out.println("\n=== Testing get() ===");
        System.out.println("Key 22 -> " + map.get(22));
        System.out.println("Key 33 -> " + map.get(33));
        System.out.println("Key 99 -> " + map.get(99)); // not in map

        System.out.println("\n=== Testing remove() ===");
        System.out.println("Removing key 33: " + map.remove(33));
        printMap(map);

        System.out.println("\n=== Reinsert after deletion ===");
        map.put(33, "B2"); // reuse DEFUNCT slot
        printMap(map);

        System.out.println("\n=== Updating an existing key ===");
        map.put(26, "E_updated");
        printMap(map);
    }

    /** Utility method to display all entries in the map */
    private static <K, V> void printMap(ProbeHashMap<K, V> map) {
        System.out.println("Entries:");
        for (var entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
