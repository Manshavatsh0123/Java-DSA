package TCSNQT;

public class CountDigit {
    public static int countNumber(int n){
        if(n ==0) return 1;

        int count = 0;
        n = Math.abs(n);

        while(n > 0){
            n /=10;
            count ++;
        }

        return count;
    }
    public static void main(String[] args){
        int n = 0;
        System.out.println(countNumber(n));

    }
}