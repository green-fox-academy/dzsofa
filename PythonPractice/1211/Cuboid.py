# Write a program that stores 3 sides of a cuboid as variables (float)
# The program should write the surface area and volume of the cuboid like:
#
# Surface Area: 600
# Volume: 1000

a = 12.
b = 6.
c = 10.


def calculatesurface(a, b, c):
    return 2 * (a * b + b * c + c * a)


def calculatevolume(a, b, c):
    return a * b * c


print(calculatesurface(a, b, c))

print(calculatevolume(a, b, c))

