//Give n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

package Arrays;

public class TrappingRainwater {
    public static int trappingRainwater(int height[]) {
        int n = height.length;

        // Calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary
        int rightMax[] = new int[height.length];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Water-Trapped in bars :" + trappingRainwater(height));
    }
}

// Water-Trapped in bars :11
