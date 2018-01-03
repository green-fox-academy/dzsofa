# 3. Given a non-negative int n,
# return the sum of its digits recursively (no loops).
# Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
# while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


def sumdigits(n):
    if n % 10 == n or n <= 0:
        return n
    else:
        return (n % 10) + sumdigits(n // 10)


print(sumdigits(5326))
