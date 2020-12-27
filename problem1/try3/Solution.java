import java. util.*; // yes, I know this is bad practice

class Solution {

    // main method for testing purposes
	public static void main(String[] args) {
		int[] intArray = {3,2,4};
		int[] res = twoSum(intArray, 6);
		System.out.println(Arrays.toString(res));
	}

    public static int[] twoSum(int[] nums, int target) {
        // hashmaps are closest to O(1) lookup, although space complexity will likely
        // suffer in case of large amounts of data.
    	Map<Integer, Integer> map = new HashMap<>();

        // iterate through the array
    	for (int i = 0; i < nums.length; i++) {
            // the complement is the number which, added to the current number,
            // sums up to the target
    		int complement = target - nums[i];

            // if we found the complement, it means that there exists two elements
            // (this one, and its complement which we have already added to the map)
            // which add up to the target.
    		if (map.containsKey(complement)) {
    			return new int[]{i, map.get(complement)};
    		}

            // We put this element in the hashmap. Later (see previous if statement), we will
            // look for this element to see if this element and another add up to the target
    		map.put(nums[i], i);
    	}

    	throw new IllegalArgumentException("no match found");
    }
}