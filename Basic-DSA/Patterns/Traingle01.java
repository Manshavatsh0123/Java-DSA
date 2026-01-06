//0-1 Traingle -(Advanced Patterns)

package Patterns;
public class Traingle01 {
    public static void traingle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        traingle(5);
    }
}

// 0
// 10
// 010
// 1010
// 01010