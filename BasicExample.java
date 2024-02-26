// BASIC Example Program
// Input: An integer, listlen, where listlen is less
// than 100, followed by listlen-integer values
// Output: The number of input values that are greater
// than the average of all input values

import java.util.Scanner;
public class BasicExample {
    public static void main(String[] args) {
        int[] intlist = new int[99];  
        int result = 0; 
        int sum = 0; 
        int listlen; 
        Scanner sc = new Scanner(System.in);
        listlen = sc.nextInt();

        if (listlen > 0 && listlen < 100) {
            // Read input into an array and compute the sum 
            for (int i = 0; i < listlen; i++) {
                intlist[i] = i + 1;
                sum = sum + intlist[i]; 
            }

            // Compute the average
            int average = sum / listlen; 

            // Count the number of input values that are > average
            for (int i = 0; i < listlen; i++) {
                if (intlist[i] > average) {
                    result += 1;
                }
            }

            // Print the result
            System.out.println("The number of values that are > average is: " + result); 
        }
        else {
            System.out.println("Error-input list length is not legal");
        }
        sc.close();
    }
}
