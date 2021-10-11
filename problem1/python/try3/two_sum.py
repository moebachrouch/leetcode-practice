# accepted (refactored try2)
# O(n)

def twoSum(nums, target):
    map = {}
    for i in range(len(nums)):
        complement = target - nums[i]
        if complement in map:
            return [map[complement], i]
        map[nums[i]] = i

print(twoSum([2, 7, 11, 15], 9))
