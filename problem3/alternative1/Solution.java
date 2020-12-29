class Solution {
    public int lengthOfLongestSubstring(String s) {
        // O(n^3) solution
        int len = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (onlyUniqueChars(substring)) len = j - i;
                if (len > maxLen) maxLen = len;
            }
        } 

        return maxLen;
    }

    private boolean onlyUniqueChars(String s) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) set.add(c);
            else return false;
        }
        return true;
    }
}