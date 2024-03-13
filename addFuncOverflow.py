# Function checks for overflow by comparting the addition to the max integer range viable in python
def add_fcnInt(x: int, y: int,sum: int):
    # add numbers and store in variable sum
    sum = x + y

    # check if variable sum is outside the bounds of standard python int
    # return overflow as True if passes
    if (sum > (2 ** 31 - 1)):
        return True

    return False



