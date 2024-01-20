import java.util.Scanner;

public class Multiplication {
    public static final int MAX = 1000; 

    public static int mult_rec(int f, int s) {
        if (s == 1) 
            return f; 
        
        return (f + mult_rec(f, s - 1)); 
    }

    public static int mult_iter(int f, int s) {
        int prod = 0;

        for (int x = 1; x <= s; x++) {
            prod = prod + f;
        }

        return prod;
    }

    public static void main(String[] args) {
        int first = 0;
        int second = 0; 

        // get user input
        Scanner firstScan = new Scanner(System.in);
        System.out.println("Enter first number to be multiplied. (Range 1-1000): "); 
        first = firstScan.nextInt(); 

        Scanner secondScan = new Scanner(System.in);
        System.out.println("Enter second number to be multiplied. (Range 1-1000): "); 
        second = secondScan.nextInt(); 

        // program checks user input
        if (first <= 0 || second <= 0) {
            // checks for non zeroes
            System.out.println("Program closing. Numbers must be in range 1-1000. (Not 0!)");
        }
        else if (first > MAX || second > MAX) {
            // checks for out of bounds
            System.out.println("Program closing. Numbers must be in range 1-1000.");
        }
        else {
            // run and display multiplication with iteration, recursion, and inline notation
            System.out.println("Running result of " + first + " * " + second + " in line: " + first * second);
            
            System.out.println("Running result of " + first + " * " + second + " recursively: " + mult_rec(first, second));

            System.out.println("Running result of " + first + " * " + second + " iteratively: " + mult_iter(first, second));
        }

        // close scanners
        firstScan.close();
        secondScan.close(); 
    }
}