def search(nums, target):
    lst = sorted(nums)

    low = 0
    high = len(lst) - 1
    while (low <= high):
        if lst[mid] < target:
            low = mid + 1
        elif lst[mid] > target:
            high = mid - 1
        elif lst[mid] == target:
            return mid
        mid = (low + high) // 2
    return -1


print(search([-1, 0, 3, 5, 9, 12], 2))
