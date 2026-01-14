package BITManipulation;

public class Power {
    public static boolean isPowerTwo(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.print(isPowerTwo(15));
    }
}

//isPowerTwo(8)
//true

//isPowerTwo(15)
//false
