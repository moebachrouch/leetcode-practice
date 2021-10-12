# O(nlogn + n) = O(nlogn)

def missing_number(nums):
    lst = sorted(nums)
    for i in range(len(lst)):
        if lst[0] != 0:
            return 0
        if lst[len(lst) - 1] != len(lst):
            return len(lst)
        if lst[i] != i:
            return i


print(missing_number([0]))
print(missing_number([3,0,1]))
print(missing_number([9, 6, 4, 2, 3, 5, 7, 0, 1]))
