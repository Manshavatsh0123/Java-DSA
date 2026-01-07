//Reverse an Array 

package Arrays;
public class ReverseArray {

    public static int reverseArrays(int numbers[]) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        reverseArrays(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
    }
}

//Time Complexity - O(n)

//Output - 10 9 8 7 6 5 4 3 2 1 
