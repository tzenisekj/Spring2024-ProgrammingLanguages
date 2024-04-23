# Program takes in a list of numbers from user and displays the average of all numbers


# Function takes in list of numbers and calculates the average of all numbers
def calcAverage(numList):
    sum = 0
    for num in numList:
        sum += num

    return sum / len(numList)

# main Function
if __name__ == '__main__':
    inputList = []

    while True:
        i = input("Enter a number to store. Enter 0 to exit input step: ")

        if i == '0':
            break
        else:
            inputList.append(int(i))

    print("Input List Average: " + str(calcAverage(inputList)))