# 5. We have a number of bunnies and each bunny has two big floppy ears.
# We want to compute the total number of ears across all the bunnies
# recursively (without loops or multiplication).

def countears(bunnycount):
    if bunnycount == 1:
        return 2
    else:
        return 2 + countears(bunnycount - 1)


print(countears(10))