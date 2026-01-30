package arraylistdemo;
import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Get Element - O(1)
        int element = list.get(2);
        System.out.println(element);

        //Remove Element - O(n)
        list.remove(2);
        System.out.println(list);

        //Set Element - O(n)
        list.set(0, 0);
        System.out.println(list);

        //Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(5));

    }
}

// [1, 2, 3, 4, 5]
// 3
// [1, 2, 4, 5]
// [0, 2, 4, 5]
// false
// true