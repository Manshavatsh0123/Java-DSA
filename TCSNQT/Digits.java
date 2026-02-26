package TCSNQT;

public class Digits{
    public static int countDigits(int n){
        int sum =0;

        while(n>0){
            sum += n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main (String[] args){
        int n = 10899;
        System.out.println(countDigits(n));
    }
}
