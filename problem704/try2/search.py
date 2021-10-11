def search(nums, target):
    lst = sorted(nums)

    low = 0
    high = len(lst) - 1

    while (low <= high):
        mid = (low + high) // 2
        if lst[mid] < target:
            low = mid + 1
        elif lst[mid] > target:
            high = mid - 1
        elif lst[mid] == target:
            return mid
    return -1
