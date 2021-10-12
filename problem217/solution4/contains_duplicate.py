# O(n + nlogn) = O(nlogn)

def contains_duplicate(nums):
    lst = sorted(nums)
    for i in range(len(nums) - 1):
        if lst[i] == lst[i + 1]:
            return True
    return False


print(contains_duplicate([1, 2, 3, 4]))
print(contains_duplicate([1, 2, 3, 1]))
