package problems.string;

public class DetermineLargestWord {

    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */

    public static void main(String[] args) {

        String str = "Human brain is a biological learning machine";
        System.out.println(LongestWordLength(str));
    }

        static int LongestWordLength(String str)
        {
            int n = str.length();
            int res = 0, curr_len = 0;
            for (int i = 0; i < n; i++){

                if (str.charAt(i) != ' ') {
                    curr_len++;
                }
                else
                {
                    res = Math.max(res, curr_len);
                    curr_len = 0;
                }
            }

            return Math.max(res, curr_len);
        }
    }

