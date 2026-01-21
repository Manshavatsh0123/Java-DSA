//Merge Sort using Divide and Conquer Approach.
//Merge Sort is a stable sorting algorithm with a time complexity of O(n log n).

package DivideConquer;

public class MergeSort {
    public static void mergeSort(int[] arr, int si, int ei) {

        // Base Case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // (si + ei)/2
        mergeSort(arr, si, mid);// left part
        mergeSort(arr, mid + 1, ei);// right part

        merge(arr, si, mid, ei);// merge two sorted arrays
    }

    // Merge two sorted arrays
    public static void merge(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // pointer for left part
        int j = mid + 1;// pointer for right part
        int k = 0;// pointer for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }

        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[si + l] = temp[l];
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}

//6 3 9 5 2 8 
