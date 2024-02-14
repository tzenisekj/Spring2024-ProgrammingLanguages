

if __name__ == '__main__':
    generatedCode = open("SampleCode.cpp", 'r')  # variable holds the code to be scanned
    lexicalList = []    # list holds symbols scanned by analayzer 
    symbolList = ["+", "-", "*", ";", "="]
    keywords = ["int", "char", "string", "float", "double", "cout", "cin", "<<", ">>", "\\t"]

    inFunction = False
    underQuotes = False

    while True:
        line = generatedCode.readline()
        holder = ""
        if not line: 
            break

        # proccess the code in each line
        for i in line: 
            if i == " ":
                if underQuotes:
                    holder += i
                else:
                    if holder == "":
                        continue

                    if not inFunction: 
                        if holder == "#include": 
                            break; 
                        elif holder == "()": 
                            lexicalList.pop()
                            inFunction = True
                            holder = ""
                            break
                        else:
                            lexicalList.append(holder)
                            holder = ""
            else: 
                if i == "\"":
                    if underQuotes:
                        underQuotes = False
                    else:
                        underQuotes = True
                    holder += i
                elif i in symbolList:
                    if not underQuotes:
                        if holder.find("\\"):
                            lexicalList.append(holder[1::])
                            holder = ""
                            lexicalList.append(i)
                        else:
                            lexicalList.append(holder)
                            holder = ""
                            lexicalList.append(i)
                    else:
                        holder += i
                else:
                    holder += i
                        

    print(lexicalList)
    generatedCode.close()





