numbers = [7, 5, 8, -1, 2]
# Write a function that returns the minimal element
# in a list (your own min function)


def minimum(mylist):
    lowest = mylist[0]
    for number in mylist:
        if number < lowest:
            lowest = number
    print(lowest)


minimum(numbers)