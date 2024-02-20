import java.util.Scanner;

public class A3Automate {
    /*
     * Function:        A3_map
     * Parameters:      state: String, symbol: char
     * Returns:         String
     * 
     * - A3_map provides the mapping of the automaton based on 
     * - the current state the input string is at.
     * -
     * - Function returns next state in a string format. 
     * - returns empty string if invalid symbol or state is 
     * - passed.
     */
    public static String A3_map(String state, char symbol) {
        if (state == "q0" && symbol == '1') {
            return "q1";
        }
        else if (state == "q0" && symbol == '0') {
            return "q2";
        }
        else if (state == "q1" && symbol == '0') {
            return "q3";
        }
        else if (state == "q1" && symbol == '1') {
            return "q0";
        }
        else if (state == "q2" && symbol == '0') {
            return "q0";
        }
        else if (state == "q2" && symbol == '1') {
            return "q3";
        }
        else if (state == "q3" && symbol == '0') {
            return "q1";
        }
        else if (state == "q3" && symbol == '1') {
            return "q2";
        }
        else {
            return "";
        }
    }

    /*
     * Function:        A3_number
     * Parameters:      input_string: String
     * Returns:         Boolean
     * 
     * - Function runs through the input string to test the 
     * - automaton if it will sucessfully run work or not.
     * 
     * - Returns True if successful or False if not sucessfull
     */
    public static Boolean A3_number(String input_string) {
        // initialized variables
        String currState = "q0";    // first state
        String finalState = "q0";   // end state

        // loops through string testing all inputs
        for (int i = 0; i < input_string.length(); i++) {
            // gets next state based on current state
            currState = A3_map(currState, input_string.charAt(i));

            // check for break in process
            if (currState == "") {
                break; 
            }
        }

        // returns True or False if string is good 
        if (currState == finalState) {
            return true;
        }
        else {
            return false; 
        }
    }

    public static void main(String[] args) {  
        // initialized variables
        String[] testStrings = {"01", "11010", "010101", "110101", "00", "000110100"};
        
        System.out.println("Testing Automan A3...\n------------------");
        for (int i = 0; i < testStrings.length; i++) {
            System.out.println("Testing: " + testStrings[i]); 
            System.out.println("Result: " + A3_number(testStrings[i]));
        }
    }
}
