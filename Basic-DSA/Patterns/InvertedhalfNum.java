//Inverted Half-Pyramid with Number - (Advanced Patterns)

package Patterns;
public class InvertedhalfNum {
    public static void HalfNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HalfNumberPyramid(4);
    }
}

// 1234
// 123
// 12
// 1
