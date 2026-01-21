//You have 3 tower and N disks. You have to transfer all the disks from tower A to C using B as helper tower.
// The disks are arranged in increasing order of size such that the topmost disk is the smallest one.

package Recursion;

public class TowerOfHonoi {
    public static void towerofhonoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " form " + src + " to " + dest);
            return;
        }
        towerofhonoi(n - 1, src, helper, dest);
        System.out.println("Transfer disk " + n + " form " + src + " to " + dest);
        towerofhonoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n =3;
        towerofhonoi(n,"A","B","C");
    }
}

// Transfer disk 1 form A to C
// Transfer disk 2 form A to C
// Transfer disk 1 form B to C
// Transfer disk 3 form A to C
// Transfer disk 1 form B to C
// Transfer disk 2 form B to C
// Transfer disk 1 form A to C