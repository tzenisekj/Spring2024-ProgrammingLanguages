#include <iostream>

int testFunction(std::string&, char); 

int main() {
    std::string testString = "sssssssssssssssssssssssssSSSSSSSSSSSSSSSSSS0101010s00s01s0s0sdgsdg0ss";

    std::cout << "S shows up " << testFunction(testString, 's') << " times" << std::endl; 
    return 0; 
}

int testFunction(std::string& s, char testC) {
    int counter = 0; 
    for (char sc: s) {
        if (sc == testC) {
            counter++; 
        }
    }

    return counter; 
}

