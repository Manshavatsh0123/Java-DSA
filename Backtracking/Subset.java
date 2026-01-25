//Find & print all the subsets of a given set using backtracking
//abc -> "", a, b, c, ab, ac, bc, abc

//package Backtracking;

public class Subset {
    public static void findsubsets(String str, String ans, int i) {

        // base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // Yes choice 
        findsubsets(str, ans + str.charAt(i), i + 1);

        // No choice
        findsubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findsubsets(str, "", 0);
    }
}

// abc
// ab
// ac
// a
// bc
// b
// c


//TC - O(2^n * n)
//SC - O(n)  (auxiliary space)
