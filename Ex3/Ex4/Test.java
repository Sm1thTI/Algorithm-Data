package Ex4;
public class Test{
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Insert keys [15, 6, 18, 3, 7, 17, 20]
        System.out.println("Inserting elements...");
        treeMap.put(15, "A");
        treeMap.put(6, "B");
        treeMap.put(18, "C");
        treeMap.put(3, "D");
        treeMap.put(7, "E");
        treeMap.put(17, "F");
        treeMap.put(20, "G");

        System.out.println("Size: " + treeMap.size());

        // Test get
        System.out.println("Get key 7: " + treeMap.get(7));
        System.out.println("Get key 10 (not present): " + treeMap.get(10));

        // Print in-order (sorted order of keys)
        System.out.println("In-order traversal (sorted keys):");
        inorderPrint(treeMap);

        // Test remove
        System.out.println("\nRemoving key 6...");
        treeMap.remove(6);
        inorderPrint(treeMap);

        System.out.println("\nRemoving key 15 (root with two children)...");
        treeMap.remove(15);
        inorderPrint(treeMap);
    }

    // Helper: recursive inorder traversal (keys in ascending order)
    private static void inorderPrint(TreeMap<Integer, String> map) {
        inorder(map, getRoot(map));
        System.out.println();
    }

    // Access the root field using reflection (since it's private)
    private static TreeMap<Integer, String>.Node getRoot(TreeMap<Integer, String> map) {
        try {
            java.lang.reflect.Field f = map.getClass().getDeclaredField("root");
            f.setAccessible(true);
            return (TreeMap<Integer, String>.Node) f.get(map);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void inorder(TreeMap<Integer, String> map, TreeMap<Integer, String>.Node n) {
        if (n == null) return;
        inorder(map, n.left);
        System.out.print(n.key + " ");
        inorder(map, n.right);
    }
}


