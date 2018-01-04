numbers = [4, 5, 6]


def linear_search(my_list, sought):
    for number in my_list:
        if number == sought:
            return my_list.index(number)
    return -1


print(linear_search(numbers, 6))
