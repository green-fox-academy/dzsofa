
i = 1357988018575474
# tell if it has 11 as a divisor


def divisable(number, divisor):
    if number % divisor == 0:
        return True
    else:
        return False


print(divisable(i, 11))
