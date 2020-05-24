public class HashMap {
    public class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    private Entry[] map;
    private int size;

    public HashMap(int capacity) {
        this.map = new Entry[capacity];
        this.size = 0;
    }

    public void put(int key, String value) {
        if (isFull())
            throw new IllegalStateException("Map is full");

        for (int i = 0; i < map.length; i++) {
            var index = (hash(key) + i) % map.length;
            if (map[index] == null) {
                map[index] = new Entry(key, value);
                size++;
                return;
            }
        }
    }

    public String get(int key) {
        if (isEmpty())
            throw new IllegalStateException("Map is Empty");

        for (int i = 0; i < map.length; i++) {
            var index = (hash(key) + i) % map.length;
            if (map[index] == null)
                throw new IllegalStateException("No such key found");

            if (map[index].key == key) 
                return map[index].value;
        }
        return null;
    }

    public void remove(int key) {
        if (isEmpty())
            throw new IllegalStateException("Map is Empty");

        for (int i = 0; i < map.length; i++) {
            var index = (hash(key) + i) % map.length;
            if (map[index].key == key) {
                map[index] = null;
                size--;
                return;
            }
        }

    }

    public int size() {
        return size;
    }

    private int hash(int key) {
        return key % map.length;
    }

    private boolean isFull() {
        return size == map.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}