#include <iostream> // necessary for cout and cin
#include <algorithm> // necessary for std::reverse

// function prototypes
std::string convertToBinary(int);

int main() {
	int number;  

	// get user input
	std::cout << "Input a number to be converted to binary: "; 
	std::cin >> number; 

	// display binary
	std::cout << "\n" << number << " in binary is: " << convertToBinary(number) << std::endl; 
	return 0; 
}

/*
	- Function takes in an argument num (int) by copy and uses division to calculate the binary string
	- Adds 0 to result if there is no remainder from division by 2. Adds 1 if there is a remainder. 
	- Parameters (int num): number passed to be converted to binary
	- Returns: std::string result: binary string
*/
std::string convertToBinary(int num) {
	std::string result = "";

	while (num != 0) {
		// checks binary to add
		if (num % 2 != 0) {
			result += "1";
		}
		else {
			result += "0";
		}

		// calculate division 
		num /= 2; 
	}
	
	// reverse string and return
	std::reverse(result.begin(), result.end()); 
	return result; 
}