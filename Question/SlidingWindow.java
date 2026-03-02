package Question;

public class SlidingWindow {
    
    public static int maxOncs(int[] arr) {
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                left = right + 1;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 ,1 };
        System.out.println(maxOncs(arr));
    }
}
