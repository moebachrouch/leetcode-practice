class Solution {
    public int[] twoSum(int[] nums, int target) {
      // classic O(n^2) solution. This solution is super slow and not the best, but it works.

      // iterate over every element in the array from left to right
       for (int i = 0; i < nums.length; i++) {
        // for every i, iterate over j starting with the next i. We start at the next i (i+1)
        // in order to ensure that we don't return the same index twice if the element it maps
        // to sums up to the target, as per the restrictions of the problem
           for (int j = i + 1; j < nums.length; j++) {
               if (nums[i] + nums[j] == target) {
                   return new int[]{i, j};
               }
           }
       }
       throw new IllegalStateException("not found");
    }
}