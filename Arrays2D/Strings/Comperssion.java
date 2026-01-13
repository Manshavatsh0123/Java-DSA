//String Compression

package Arrays2D.Strings;
public class Comperssion {
    public static String compress(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(str.charAt(i));

            if (count > 1) {
                result.append(count);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
       String str = "aabbbbcccddddeeee";
       System.out.println(compress(str));
    }
}

//output - aabbbbcccddddeeee
