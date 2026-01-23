package Recursion;
public class Sum {

    public static int sum(int n) {
        if (n == 1) { //base case
            return 1;
        }
        return n + sum(n - 1);   
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n)); 
    }
}

// 15

//Total work done = n X k = O(n) [where k is constant time for addition operation]
//Time Complexity = O(n)

//Space Complexity = O(n) [due to recursive call stack]