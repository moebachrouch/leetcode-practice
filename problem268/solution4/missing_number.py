# O(n) optimized solution3

def missing_number(nums):
    n = len(nums) + 1
    total = (n * (n - 1)) // 2
    sums = sum(nums)
    return total - sums 


print(missing_number([1]))
print(missing_number([3, 0, 1]))
print(missing_number([9, 6, 4, 2, 3, 5, 7, 0, 1]))