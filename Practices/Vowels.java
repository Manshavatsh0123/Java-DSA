package Practices;
import java.util.*;

public class Vowels {
    static int isVowels(String s){

        int count = 0;

        for(char c:s.toLowerCase().toCharArray()){

            if("aeiou".indexOf(c)>=0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isVowels(s));
        sc.close();
    }
}

// education
// 5
