# Write a program that asks for two numbers and prints the bigger one


number1 = int(input("Give me the first number: "))
number2 = int(input("Give me the second number"))


def printbigger(number1, number2):
    if number1 > number2:
        print(number1)
    elif number2 > number1:
        print(number2)
    else:
        print("The numbers are equal")


printbigger(number1, number2)


