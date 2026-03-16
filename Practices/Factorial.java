package Practices;

public class Factorial{
    public static long factorial(int n){
        long fact = 1;
        for(int i =1;i <=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}

// Input: N = 10 
// Output: 0 1 1 2 3 5 8 13 21 34 
// Explanation: Here, first term of Fibonacci is 0 and second is 1, so that 3rd term = first(o) + second(1) etc and so on.