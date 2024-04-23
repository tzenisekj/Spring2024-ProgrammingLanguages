/*
Program takes in a dynamically growing list of numbers from user and displays the biggest number found in the list
*/

#include <iostream>
#include <string>

// function prototypes
void growArray(int*, int);
int findMax(int*, int);

// main function
int main() {
    int size = 0;
    int* numList = new int[size];

    std::string input;
    while (true) {
        input = "";
        std::cout << "Enter a number to store. Enter 0 to exit number input: ";
        std::cin >> input;

        if (input == "0") break;
        else {
            growArray(numList, size);

            numList[size] = std::stoi(input);
            size++;
        }
    }

    std::cout << "Largest number in list: " << findMax(numList, size) << std::endl;
    return 0;
}

// Function takes in address for array and allocates new memory for it to grow dynamically
void growArray(int* arr, int size) {
     
    int* newArr = new int[size + 1];

    if (size > 0) {
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
    }
    
    arr = newArr; 
}

// Function finds the largest number in the list
int findMax(int* arr, int size) {
    int max = 0;
    int i = 0;
    int j = size - 1;

    while (!(i > j)) {
        if (arr[i] > max) max = arr[i];
        if (arr[j] > max) max = arr[j];

        i++;
        j--;
    }

    return max;
}