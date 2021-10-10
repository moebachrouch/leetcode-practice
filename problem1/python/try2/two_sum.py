# accepted

def twoSum(nums, target):
    map = {}
    for i in range(len(nums)):
        complement = target - nums[i]
        if nums[i] not in map:
            map[nums[i]] = i
        if complement in map and map[complement] != i and nums[map[complement]] + nums[i] == target:
            return [map[complement], i]


print(twoSum([2, 7, 11, 15], 9))
