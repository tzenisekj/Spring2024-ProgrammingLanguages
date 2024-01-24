import java.util.Scanner;

public class AddittionRecursion {
	
	public static int addRec(int f, int s) {
		if (f == 1 || s == 1) {
			return f + 1; 
		}
		
		return 1 + addRec(f, s - 1); 
	}
	
	public static void main(String[] args) {
		int firstNum; 
		int secondNum; 
		
		// first number from user
		Scanner firstScanner = new Scanner(System.in); 
		System.out.print("Enter a number to be added: "); 
		firstNum = firstScanner.nextInt(); 
		
		// second number from user
		Scanner secondScanner = new Scanner(System.in); 
		System.out.print("Enter a second number to be added: "); 
		secondNum = secondScanner.nextInt(); 
		
		// perform addition and output
		System.out.println(firstNum + " + " + secondNum + " = " + addRec(firstNum, secondNum)); 
		
		// close scanners
		firstScanner.close(); 
		secondScanner.close(); 
	}
}
