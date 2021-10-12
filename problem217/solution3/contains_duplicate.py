# O(n)

def contains_duplicate(nums):
    contains = {}
    for num in nums:
        if num in contains:
            return True
        else:
            contains[num] = False
    return False


print(contains_duplicate([1, 2, 3, 4]))
print(contains_duplicate([1, 2, 3, 1]))
