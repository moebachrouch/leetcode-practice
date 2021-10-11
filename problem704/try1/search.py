def search(nums, target):
    for i in range(len(nums)):
        if target == nums[i]:
            return i
    return -1