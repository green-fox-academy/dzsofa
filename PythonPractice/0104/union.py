# union([4,5,6], [1,2,3])
# expected output: [4,5,6,1,2,3]

# union([4,5,7], [4,1,7])
# expected output: [1,4,5,7]


def union(list1, list2):
    return list(set(list1).symmetric_difference(list2))


print(union([4,5,6], [6,7,8,9]))
