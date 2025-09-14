package Ex1;

public class Test {
    public static void main(String[] args) {
        UnsortedTableMap<Integer, String> map = new UnsortedTableMap<>();

        System.out.println("=== Insert elements ===");
        System.out.println("put(1, A) -> " + map.put(1, "A")); // null (new)
        System.out.println("put(2, B) -> " + map.put(2, "B")); // null (new)
        System.out.println("put(3, C) -> " + map.put(3, "C")); // null (new)
        System.out.println("size = " + map.size());

        System.out.println("\n=== Get elements ===");
        System.out.println("get(2) -> " + map.get(2)); // B
        System.out.println("get(5) -> " + map.get(5)); // null (not found)

        System.out.println("\n=== Update element ===");
        System.out.println("put(2, BB) -> " + map.put(2, "BB")); // returns old value "B"
        System.out.println("get(2) -> " + map.get(2)); // BB

        System.out.println("\n=== Remove element ===");
        System.out.println("remove(3) -> " + map.remove(3)); // C
        System.out.println("remove(5) -> " + map.remove(5)); // null
        System.out.println("size = " + map.size());

        System.out.println("\n=== Iterate keys ===");
        for (Integer key : map.keySet()) {
            System.out.println("key = " + key);
        }

        System.out.println("\n=== Iterate values ===");
        for (String value : map.values()) {
            System.out.println("value = " + value);
        }

        System.out.println("\n=== Iterate entries ===");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("entry: " + e.getKey() + " -> " + e.getValue());
        }
    }
}
