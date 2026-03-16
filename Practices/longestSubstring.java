package Practices;

import java.util.*;

public class longestSubstring {
    public static int longestString(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int r = 0; r < s.length(); r++) {

            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(r));

            maxLen = Math.max(maxLen, r - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Longest String :" + longestString(s));

        sc.close();
    }
}
