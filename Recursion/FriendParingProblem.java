//Friend Paring Problem.

package Recursion;
public class FriendParingProblem {

    public static int friendsparing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsparing(n - 1) + (n - 1) * friendsparing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendsparing(3));
    }
}

//4

