//String - an object that represents an immutable sequence of characters.

package Strings;
import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); //input of string
        System.out.println("Enter name of the user : " + name);
        System.out.println("Enter name length of the user : " + name.length()); //function
        sc.close();
    }
}

// Mansha
// Enter name of the user : Mansha
// Enter name length of the user : 6


//nextLine -> hole words