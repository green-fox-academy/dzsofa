
s = [1, 2, 3, 8, 5, 6]
# change the 8 to 4


def replace(list, index, replacement):
    list[index] = replacement
    return list


print(replace(s, 3, 4))
