import java.util.ArrayList;
import java.util.Random;

public class chap1{
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numList.add(i);
        }
        System.out.println("Before shuffle: " + numList);
        shuffle(numList);
        System.out.println("After shuffle: " + numList);
    }
    
    public static <E> void shuffle(ArrayList<E> list) {
        Random rand = new Random();
        int n = list.size();

        for(int i = n - 1; i > 0; i--){
            int j = rand.nextInt(i + 1);
            E temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}