package Question;

import java.util.HashSet;

public class SubString {
    
    public static int lengthofString(String str) {
        HashSet<Character> hs = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {
            while (hs.contains(str.charAt(right))) {
                hs.remove(str.charAt(left));
                left++;
            }
            hs.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcabc";
        System.out.println("Length of Strings:" + lengthofString(str));
    }
}

//Length of Strings:3
