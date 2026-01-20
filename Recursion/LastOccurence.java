// WAF to last occurence of an element in an array.

package Recursion;
public class LastOccurence {
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);

        if (isFound != -1) {
            return isFound;
        }
        if (arr[i] == key) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 7, 5, 3 };
        System.out.println(lastOccurence(arr, 5, 0));
    }
}