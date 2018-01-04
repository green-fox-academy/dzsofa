names = ['Zakarias', 'Hans', 'Otto', 'Ole']
# create a function that returns the shortest string
# from a list


def shortest(list):
    short = list[0]
    for element in list:
        if len(element) < len(short):
            short = element
    return element


print(shortest(names))
