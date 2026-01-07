//Linear Search - find the index of element in a given array.
//Find the index of element in a given arrays - Linear Search.

package Arrays.LinearSearch;
public class LinearSearch {

    public static int linear(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 5;

        int index = linear(numbers, key);

        if (index == -1) {
            System.out.println("Not Found!");
        } else {
            System.out.println("Key is at index :" + index);
        }
    }
}

// Time Complexity - O(n)
//O(n) - you ask each friends one by one if they have a pen.
