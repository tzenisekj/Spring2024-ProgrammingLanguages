def testFunctino(s, testC):
    counter = 0
    for c in s:
        if c == testC:
            counter += 1
    
    return counter

testString = "sssssssssssssssssssssssssSSSSSSSSSSSSSSSSSS0101010s00s01s0s0sdgsdg0ss"

print("S shows up " + str(testFunctino(testString, "s")) + " times")