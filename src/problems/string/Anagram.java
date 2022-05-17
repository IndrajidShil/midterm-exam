package problems.string;

import java.util.Arrays;

public class Anagram {

    /*
     *
     * write a Java Program to check if the two String are Anagram
     * two Strings are called Anagram when there is same character but in different order
     * examples: "CAT" and "ACT", "ARMY" and "MARY"
     *
     */

    public static void main(String[] args) {
        char str1[] = { 'M', 'A', 'R', 'Y' };
        char str2[] = { 'A', 'R', 'M', 'Y' };

        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other.");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other.");

        }
    static boolean areAnagram(char[] str1, char[] str2){
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2) {
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }
}


