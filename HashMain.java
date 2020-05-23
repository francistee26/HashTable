public class HashMain {
    public static void main(String[] args) {
        int[] items = {1, 7, 5, 9, 2, 12, 3};
        HashTableExercise mostF = new HashTableExercise(items);
        var mostFre=mostF.countPairsWithDiff(2);
        System.out.println(mostFre);



        // HashTable hash = new HashTable();
        // hash.put(6, "A");
        // hash.put(8, "B");
        // hash.put(11, "C");
        // hash.put(6, "A+");
        // hash.remove(60);
        // System.out.println(hash.get(10));
    }
}