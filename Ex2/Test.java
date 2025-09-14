package Ex2;

public class Test {
    public static void main(String[] args) {
        ChainHashMap<String, Integer> map = new ChainHashMap<>();

        System.out.println("---- put() and size() ----");
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        System.out.println("Size after inserts: " + map.size());

        System.out.println("\n---- get() ----");
        System.out.println("Alice: " + map.get("Alice"));
        System.out.println("Bob: " + map.get("Bob"));
        System.out.println("Missing key (David): " + map.get("David"));

        System.out.println("\n---- update existing key ----");
        map.put("Alice", 28);
        System.out.println("Alice after update: " + map.get("Alice"));

        System.out.println("\n---- remove() ----");
        System.out.println("Removed Bob -> " + map.remove("Bob"));
        System.out.println("Bob after remove: " + map.get("Bob"));
        System.out.println("Size after remove: " + map.size());
    }
}
