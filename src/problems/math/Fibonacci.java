package problems.math;

public class Fibonacci {

    /*
     *
     * write 30 Fibonacci numbers with java
     * 0,1,1,2,3,5,8,13
     *
    */

    public static void main(String[] args) {
            int N = 10;
            Fibonacci(N);
        }
        static void Fibonacci(int N) {
            int num1 = 0, num2 = 1;
            int counter = 0;

            // Iterate till counter is N
            while (counter < N) {
                System.out.print(num1 + " ");

                // Swap
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                counter = counter + 1;
            }
        }
    }
