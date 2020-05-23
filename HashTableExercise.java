import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercise {
    Map<Integer, Integer> map;
    Set<Integer> set;
    private int[] items;
    private int mostFr;
    private int count;

    public HashTableExercise(int[] items) {
        this.map = new HashMap<>();
        this.set = new HashSet<>();
        this.items = items;
        this.mostFr = -1;
        this.count = 0;
    }

    public int mostFrequent() {
        for (var item : items) {
            var value = (map.containsKey(item)) ? map.get(item) : 0;
            map.put(item, value + 1);
        }

        for (var item : items) {
            if (map.get(item) > mostFr)
                mostFr = item;

        }
        return mostFr;
    }

    public int countPairsWithDiff(int k){
        for(var item : items)
            set.add(item);
        for(var item : items){
            if(set.contains(item + k))
                count++;
            if(set.contains(item - k))
                count++;
            set.remove(item);
        }
        return count;
    }

    public int[] twoSum(int target){
        for(var i = 0; i < items.length; i++){
            var compliment = target - items[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment), i};
            }
            map.put(items[i], i);
        }
        return null;
        
    }
}