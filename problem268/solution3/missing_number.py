# 

def missing_number(nums):
    c = set()
    for num in nums:
        c.add(num)

    for num in range(len(nums) + 1):
        if num not in c:
            return num
            
print(missing_number([1]))
print(missing_number([3, 0, 1]))
print(missing_number([9, 6, 4, 2, 3, 5, 7, 0, 1]))
