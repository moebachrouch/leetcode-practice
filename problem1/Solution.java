import java. util.*;

class Solution {

	public static void main(String[] args) {
		int[] intArray = {3,2,4};
		int[] res = twoSum(intArray, 6);
		System.out.println(Arrays.toString(res));
	}

    public static int[] twoSum(int[] nums, int target) {
    	HashMap<Integer, Integer> map = new HashMap<>();

    	for (int i = 0; i < nums.length; i++) {
    		int complement = target - nums[i];
    		if (map.containsKey(complement)) {
    			return new int[]{i, map.get(complement)};
    		}

    		map.put(nums[i], i);
    	}

    	throw new IllegalArgumentException("no match found");
    }
}