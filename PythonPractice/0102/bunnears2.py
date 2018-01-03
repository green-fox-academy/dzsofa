# 6. We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
# (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
# have 3 ears, because they each have a raised foot. Recursively return the
# number of "ears" in the bunny line 1, 2, ... n (without loops or
# multiplication).

def countears(bunnycount):
    if bunnycount == 1:
        return 3
    elif bunnycount % 2 == 1:
        return 3 + countears(bunnycount - 1)
    else:
        return 2 + countears(bunnycount - 1)


print(countears(10))
