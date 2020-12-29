class Solution {
    public String longestPalindrome(String s) {
        int len = 0;
        int maxLen = 0;
        String substring = "";
        String longestString = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                substring = s.substring(i, j);
                len = substring.length();
                if (isPalindrome(substring) && len > maxLen) {
                    maxLen = len;
                    longestString = substring;
                }
            }
        }
        
        return longestString;
        
        
    }
    
    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}