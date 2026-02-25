package TCSNQT;

public class Basic2 {
    public static void main(String[] args) {
        String str = "Mansha";
        String str2 = "Ram";

        int len = str.length();// length of string
        System.out.println("Length of String:" + len);

        char ch = str.charAt(5); // charcater at index 5
        System.out.println("Character of name:" + ch);

        // loop
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");

        }

        // Reverse String
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String:" + rev);

        // comapre
        if (str.equals(str2)) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are different");
        }

        String s = "123";
        int num = Integer.parseInt(s);
        System.out.println("Parsed number: " + num);

        int n = 123;
        String nStr = String.valueOf(n);
        System.out.println("Parsed number: " + nStr);
    }
}