# O(n)

def missing_number(nums):
    total = sum(range(0, len(nums) + 1))
    sums = sum(nums)
    return total - sums 


print(missing_number([1]))
print(missing_number([3, 0, 1]))
print(missing_number([9, 6, 4, 2, 3, 5, 7, 0, 1]))
