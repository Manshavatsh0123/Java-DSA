//Palindrome - a sequence of characters that reads the same forwards and backward. (IMP)

package Arrays2D.Strings;
public class Palindrome {

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "mansha";
        System.out.println(isPalindrome(str));
    }
}

// String str = "noon";
// true

// String str = "mansha";
// false
