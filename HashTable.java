import java.util.LinkedList;

public class HashTable {
    public class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hashFunction(key);
        if (entries[index] == null)
            entries[index] = new LinkedList<>();

        var bucket = entries[index];
        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key, value));
    }

    public String get (int key){
        var index = hashFunction(key);
        var bucket = entries[index];
        if(bucket != null){
            for(var entry : bucket)
                if (entry.key == key)
                    return entry.value;
        }
        return null;
    }

    private int hashFunction(int key) {
        return key % entries.length;
    }

}