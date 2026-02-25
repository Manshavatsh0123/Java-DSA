package TCSNQT;

import java.util.Scanner;

public class Basic {
    public static void reverseString(int a){
        while (a > 0) {
            int rem = a % 10;
            System.out.print(rem + " ");
            a = a / 10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int a = sc.nextInt();
        reverseString(a);
        sc.close();
    }
}

// int num = sc.nextInt();
// double n = sc.nextDouble();
// long m = sc.nextLong();
// boolean b = sc.nextBoolean();
// char ch = sc.next().charAt(0);

// a++ use and change and ++a increses and change
// a-- use and chnge and --a change and use

// && - if both are true then return true , if first is false then dont check
// the second value
// || - return true if in both one of then are true , skip second if first is
// true
// ! - invert the value

//Function - block of code jo ye specific function perform karta hai
//int return value 
//boolaen return value 
//void not return value 
