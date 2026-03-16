package Practices;

import java.util.*;
public class Anagram{

    public static boolean isAngram(String a,String b){
         
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);

    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String a = sc.nextLine();
    String b = sc.nextLine();

    System.out.println(isAngram(a, b));

    sc.close();
   }
}

// Input: s1 = “geeks”  s2 = “kseeg”
// Output: true
// Explanation: Both the string have same characters with same frequency. So, they are anagrams.

// Input: s1 = "listen", s2 = "lists"
// Output: false
// Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.