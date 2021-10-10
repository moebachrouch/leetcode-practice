# this attempt does not work since the solution
# expects the indexes of the original array rather
# than the sorted array

def twoSum(nums, target):
    nums.sort()

    i = 0
    j = len(nums) - 1

    while (i <= len(nums)  and j >= 0):
        print(nums[i], nums[j])
        print(i,j)
        print()
        if (nums[i] + nums[j] == target):
            return [i,j]
        elif (nums[i] + nums[j] > target):
            j -= 1
        elif (nums[i] + nums[j] < target):
            i += 1

print(twoSum([3,2,4],6))
