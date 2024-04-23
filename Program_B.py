# Program takes in a list of numbers from user and displays the largest number in the list


# Function takes in a list of numbers and returns the largest number in the list
def findMax(numList):
    i = 0
    j = len(numList)
    max = 0

    while not (i > j):
        if numList[i] > max:
            max = numList[i]
        if numList[j] > max:
            max = numList[j]
        
        i += 1
        j -= 1

    return max

# main Function
if __name__ == '__main__':
    inputList = []

    while True:
        i = input("Enter a number to store. Enter 0 to exit input step: ")

        if i == '0':
            break
        else:
            inputList.append(int(i))

    print("Largest number entered: " + str(findMax(inputList)))