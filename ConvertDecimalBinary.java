public class ConvertDecimalBinary {
    public static String convertDecimalToBinary(double num) {
        // split decimal number 
        String[] numSplit = String.valueOf(num).split("\\.");

        // process whole number to binary 
        int firstNum =  Integer.parseInt(numSplit[0]);
        String firstPart = "";
        while (firstNum != 0) {
            if (firstNum % 2 != 0) {
                firstPart += "1";
            }
            else {
                firstPart += "0";
            }

            firstNum /= 2; 
        }

        // process decimal values to binary 
        float secondNum = Float.parseFloat("0." + numSplit[1]); 
        String secondPart = ""; 
        while (secondNum != 0) {
            float value = 2 * secondNum; 
            String[] valueSplit = String.valueOf(value).split("\\."); 
            secondPart += valueSplit[0]; 
            secondNum = Float.parseFloat("0." + valueSplit[1]); 
        }
        secondPart += "0";

        // return binary string format
        return firstPart + "." + secondPart; 
    }
    public static void main(String[] args) {
        System.out.println("7.125 to Binary: " + convertDecimalToBinary(7.125)); 
    }
}