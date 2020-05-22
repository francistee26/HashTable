public class HashMain {
    public static void main(String[] args) {
        HashTable hash = new HashTable();
        hash.put(6, "A");
        hash.put(8, "B");
        hash.put(11, "C");
        hash.put(6, "A+");
        System.out.println(hash.get(10));
    }
}