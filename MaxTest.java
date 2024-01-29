public class MaxTest {
    // function returns the max number between two numbers
    public static int max(int num1, int num2) {
        int result; 
        if (num1 > num2) {
            result = num1;
        }
        else {
            result = num2; 
        }
        return result; 
    }

    // function gets the max of 3 passed numbers
    public static int max3(int num1, int num2, int num3) {
        return max(num1, max(num2, num3)); 
    }

    public static void main(String[] args) {
        int i = 5; 
        int j = 2; 

        int k = max(i, j);

        // outputs
        System.out.println("the max, etc, is " + k);
        System.out.println("max(5, max (2, 5)) is " + max(5, max(2, 5)));
        System.out.println("max3 (-5, 2, 10) is " + max3(-5, 2, 10)); 
        System.out.println("\nEnd of Program"); 

        // date display 
        System.out.println(java.time.LocalDate.now());
    }
}
