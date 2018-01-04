
w = 24

# if w is even increment out by one


def increment(number):
    out = 0
    if number % 2 == 0:
        out += 1
    return out


print(increment(24))
