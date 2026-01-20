//Remove Duplicate in a string using recursion.

package Recursion;

public class Duplicate {
    public static void removeDuplicate(String str, int idx, StringBuffer newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDuplicate(str, idx + 1, newstr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newstr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "manshaavatshhhhhh";
        removeDuplicate(str, 0, new StringBuffer(), new boolean[26]);
    }
}

// manshvt
