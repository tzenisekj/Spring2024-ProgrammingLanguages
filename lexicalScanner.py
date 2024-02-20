

if __name__ == '__main__':
    generatedCode = ""
    n = 0
    numberLines = 0
    numCR = 0
    numHTabs = 0
    nOther = 0

    file1 = open("MyFile.txt", 'r')
    while True:
        line = file1.readline()
        if not line: 
            break

        numberLines += 1
        for c in line: 
            if c == "$":
                n += 1
            elif c == "\n":
                numCR += 1
            elif c == "\t":
                numHTabs += 1
            else:
                nOther += 1
            generatedCode += c
    
    file1.close()
    print("File contians " + str(n) + " $")
    print("File contains " + str(numberLines) + " new lines")
    print("File contains " + str(numCR) + " carriage returns")
    print("File contains " + str(numHTabs) + " horizontal tabs")
    print("File contains " + str(nOther) + " other chars")
    print("\nProgram is as follows:\n" + generatedCode)
    
    

            

    






