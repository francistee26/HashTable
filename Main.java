import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();
        // int[] numbers = {1, 2, 3, 3, 2, 1, 4};
        // for(var number : numbers){
        //     set.add(number);
        // }
        // System.out.println(set);





        var str = "green apple";
        CharFinder finder = new CharFinder();
        // var ch = finder.findFirstNonRepeatingChar(str);
        var ch2 = finder.findFirstRepeatedChar(str);
        // System.out.println(ch);
        System.out.println(ch2);
  
    }
}