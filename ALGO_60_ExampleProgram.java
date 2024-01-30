import java.util.Scanner;

public class ALGO_60_ExampleProgram {
    public static void main(String[] args) {
        int[] intlist;
        int listlen, sum, average, result;  
        sum = 0; 
        result = 0;  

        // get user input
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a value between 1 and 99 to find average data numerically by 1 from 1: ");
        listlen = inputScanner.nextInt();
         
        intlist = new int[listlen]; 

         // checks to valid user input and continue program
        if (listlen > 0 && listlen < 100) {
            // Read input into an array and compute the average;
            for (int i = 1; i <= listlen; i++) {
                intlist[i-1] = i; 
                sum += i; 
            }

            // Compute the average; 
            average = sum / listlen; 

            // Count the input values that are > average; 
            for (int i = 0; i < listlen; i++) {
                if (intlist[i] > average) {
                    result++; 
                }
            }

            // Print result; 
            System.out.println("The number of values > average is: " + result);
        }
        else {
            System.out.println("Error-input list lenght is not legal");
        }

        // close scanner
        inputScanner.close(); 
    }
}
