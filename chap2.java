import java.util.ArrayList;
import java.util.Random;

public class chap2 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(5);
        numList.add(3);
        numList.add(1);
        numList.add(7);
        numList.add(4);

        System.out.println("The list of number: "+ numList);
        
        System.out.println("The minimum number is : "+ min(numList)+"\n");

        ArrayList<String> word = new ArrayList<String>();
        word.add("Peach");
        word.add("Apple");
        word.add("Orange");
        word.add("Banana");

        System.out.println("The list of word: "+ word);
        System.out.println("The minimum word: "+min(word));

    
    }
    
    public static <E extends Comparable<E>> E min(ArrayList<E> list){
        if(list == null || list.isEmpty()){
            throw new IllegalArgumentException("List can't be empty");
        }
        E minElement = list.get(0);
        for(E Element : list){
            if(Element.compareTo(minElement) < 0){
                minElement = Element;
            }
        }
        return minElement;
    }
}