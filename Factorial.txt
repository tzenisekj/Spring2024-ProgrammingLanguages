public class NFactorial {
    public static int factorialIter(int n) {
        if (n == 0) return 0;

        int result = 1; 
        for (int i = 1; i <= n; i++) {
            result *= i; 
        }

        return result; 
    }

    public static int factorialRecur(int n, int result) {
        if (n == 0) return result; 

        return factorialRecur(n - 1, result * n);
    }

    public static void main(String[] args) {
        int[] testNums = { 2, 3, 4 };

        for (int i = 0; i < testNums.length; i++) {
            System.out.println("Iterative: N Factorial where N = " + testNums[i] + " is = " + factorialIter(testNums[i]));

            System.out.println("Recursive: N Factorial where N = " + testNums[i] + " is = " + factorialRecur(testNums[i], 1));
        }
    }
}
