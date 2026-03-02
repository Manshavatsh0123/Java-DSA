package TCSNQT;

import java.util.HashSet;

public class Set1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);

        System.out.println(hs);

        hs.remove(2);
        System.out.println(hs);

        if (hs.contains(9)) {
            System.out.println("Sets Contains");
        } else {
            System.out.println("Sets not Contains");
        }

        hs.clear();
        System.out.println("Size :" + hs.size());
    }
}

// [1, 2, 3, 4, 5, 6]
// [1, 3, 4, 5, 6]
// Sets not Contains
// Size :0