import java.util.ArrayList;
import java.util.Collections;
;
public class chap3 {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("Peach"); 
        word.add("Apple"); 
        word.add("Orange"); 
        word.add("Banana"); 
        word.add("Grape"); 

        System.out.println("Original list: "+word);
        sort(word);
        System.out.println("Sorted list: "+word);
    }
    
}
