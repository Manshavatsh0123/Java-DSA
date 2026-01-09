//Counting Sort : 

package Sorting;
public class Counting {

    public static void Sorting(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] ++;
        }
        int j = 0;
        for(int i =0;i<count.length;i++){
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i] --;
            }
        }
    }

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
