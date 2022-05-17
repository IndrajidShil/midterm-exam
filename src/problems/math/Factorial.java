package problems.math;

public class Factorial {

    /*
     *
     * factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     * write a java program to find Factorial of a given number
     * you can use Recursion or Iteration
     *
     */

    public static void main(String[] args) {

        int i;
        int fact=1;
        int number=5;
        for(i=1; i<=number; i++){
            fact= fact*i;
        }
        System.out.println("Factorial of " +number+ " is: "+fact);
    }
}
