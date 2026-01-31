//For given n line on x-axis, use 2 line to for a container such that it holds maximum water - ArrayList

package arraylistdemo;
import java.util.ArrayList;

public class MostWater {

    public static int storeWater(ArrayList<Integer> list) {
        int maxWater = 0;
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            int ht = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;

            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            if (list.get(lp) < list.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println("List is : " + list);
        System.out.println("Water Tank : " + storeWater(list));
    }
}

// List is : [1, 8, 6, 2, 5, 4, 8, 3, 7]
// Water Tank : 49
