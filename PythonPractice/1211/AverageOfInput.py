# Write a program that asks for 5 integers in a row,
# then it should print the sum and the average of these numbers like:
#
# Sum: 22, Average: 4.4

number1 = int(input("First integer:"))
number2 = int(input("Second integer:"))
number3 = int(input("Third integer:"))
number4 = int(input("Fourth integer:"))
number5 = int(input("Fifth integer:"))


def adding(a, b, c, d, e):
    return a + b + c + d + e


def average(a, b, c, d, e):
    return (a + b + c + d + e) / 5


print(sum(number1, number2, number3, number4, number5))

print(average(number1, number2, number3, number4, number5))
