package TimeSpaceComplexity;

public class BubbleSort {

    public static void Sorting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // public static void ModifiedSorting(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // boolean swapped = false;
    // for (int j = 0; j < arr.length - 1 - i; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // swapped = true;
    // }
    // }
    // if (!swapped) {
    // break;
    // }
    // }
    // }
    // Time Complexity: O(n^2) --Worst Case
    // Time Complexity: O(n) --Best Case

    // Print
    public static void printArr(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Sorting(arr);
        printArr(arr);
    }
}

// i=0 j=0to n-1(n) --- n X k
// i=1 j=0to n-2(n-1) --- (n-1) X k
// i=2 j=0to n-3(n-2) --- (n-2) X k
// i=3 j=0to n-4(n-3) --- (n-3) X k
// i=4 j=0to n-5(n-4) --- (n-4) X k
// i=5 j=0to n-6(n-5) --- (n-5) X k

// Total Work Done = n + (n-1) + (n-2) + (n-3) + ..... + 1
// = n(n+1)/2
// = O(n^2)

// Time Complexity: O(n^2) --Worst Case
// Time Complexity: O(n^2) --Best Case (Optimized Approach can do it in O(n))