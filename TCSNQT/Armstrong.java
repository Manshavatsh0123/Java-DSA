package TCSNQT;

public class Armstrong {
    public static boolean countArmStrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int digit = n% 10;
            sum += digit * digit * digit;
            n = n / 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        int n = 153;
        if(countArmStrong(n)){
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
