package arraylistdemo;
import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(45);
        list.add(9);
        list.add(10);
        list.add(5);

        Collections.sort(list, Collections.reverseOrder());
    }
}
