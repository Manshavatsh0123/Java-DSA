//Foyd's Traingle - (Advanced Pattern)

package Patterns;
public class FloydTraingle {
    public static void Traingle(int n, int counter) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Traingle(5, 1);
    }
}

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


