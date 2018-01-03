# write a recursive function
# that takes one parameter: n
# and adds numbers from 1 to n


def summing(n):
    if n <= 0:
        return 0
    else:
        return n + summing(n - 1)


print(summing(5))
