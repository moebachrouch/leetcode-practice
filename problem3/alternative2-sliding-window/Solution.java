class Solution {
    public int lengthOfLongestSubstring(String s) {
        // O(n) solution: sliding window

        // Pointer to the beginning of the sequence. This pointer will
        // rarely move. We will only move this pointer if we find duplicates
        int i = 0;

        // Pointer that is constantly moving in the string. We move this
        // pointer as long as there are no duplicates
        int j = 0;

        int len = 0;
        int maxLen = 0;

        // Set for O(1) duplicates lookup
        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                // Expand the window and add the new character to the set
                set.add(s.charAt(j++));
                len = j - i;
                // Update the max length
                if (len > maxLen) maxLen = len;
            }
            // We found a duplicate
            else {
                // We need to remove an old character
                // and decrease the window size
                set.remove(s.charAt(i++));
            }
        }

        return maxLen;
    }
}