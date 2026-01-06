//Find largest number in a given array - Linear Search
package Arrays.LinearSearch;
public class largestNumber {
    public static int Largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 10, 62, 38, 4, 6, 78, 60 };
        System.out.println("Largest value is :" + Largest(numbers));
    }
}
