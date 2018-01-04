p1 = [1, 2, 3]
p2 = [4, 5, 6, 9]
# tell if p2 has more elements than p1


def comparelists(list1, list2):
    if len(list1) > len(list2):
        print('The firs list has more elements than the second.')
    elif len(list2) > len(list1):
        print('The second list has more elements than the first.')
    else:
        print('The two list have the same number of elements.')


comparelists(p1, p2)
