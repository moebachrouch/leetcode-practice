import java. util. Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // We first sort the array. This will put the largest element at the end of the array
        // and the smallest element at the beginning, which gives us the chance to use two indexes
        Arrays.sort(nums);

        // i starts at the beginning of the array
    	int i = 0;

        // j starts at the end of the array
    	int j = nums.length - 1;

        // continue while i and j did not cross each other. If they cross each other (j >= i)
        // this would mean that no two elements sum up to the target because we would
        // be iterating over the same elements but in reverse
    	while (i < j) {
            // if target found, exit loop
    		if (nums[i] + nums[j] == target) break;

            // if the sum of the two elements is < target, then we have to increase the "sum"
            // by moving forward in i (we move from a small sum to a bigger sum since the
            // array is sorted)
    		if (nums[i] + nums[j] < target) i++;

            // opposite of previous scenario. If the sum of the two elements is > target, we have to
            // "reduce" the sum, so we move backwards in j (from a big sum to a smaller sum)
    		else if (nums[i] + nums[j] > target) j--;
    	}

        // this solution works...however, it doesn't return the proper indices! It returns
        // them relative to the SORTED array, which we don't want. We want to return the two
        // indices relative to the original array...
        int[] res = {i, j};
        return res;
    }
}