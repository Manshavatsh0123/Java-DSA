package function;

public class Binomial {
    //Function-1
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    //Function-2
    public static int Bincoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bincoff = fact_n / (fact_r * fact_nmr);
        return bincoff;
    }

    public static void main(String[] args) {
        System.out.println(Bincoff(5, 2));
    }
}
