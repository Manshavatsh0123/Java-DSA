package arraylistdemo;

import java.util.ArrayList;

public class SizeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Size of ArrayList : " + list.size());

        // Print Arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}

// Size of ArrayList : 5
// 1
// 2
// 3
// 4
// 5

