package problems.string;

public class Permutation {

    /*
     *
     * permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * write Java program to compute all permutation of a String
     *
     */

    public static void main(String[] args) {
        String s = "ABC";
        printPermutn(s, "");
    }
        static void printPermutn(String str, String ans){
            if (str.length() == 0) {
                System.out.print(ans + " ");
                return;
            }

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String ros = str.substring(0, i) + str.substring(i + 1);

                printPermutn(ros, ans + ch);
            }
        }
}
