class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int maxLen = 0;
        
        // HashSet for O(1) lookup
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);        
            if (!map.containsKey(c)) {
                len ++;
                map.put(c, len);
            } 
            else {
                len++;
                len = len - map.get(c);
                // map = new HashMap<>();
                Iterator<Integer> iterator = map.values().iterator();
                while (iterator.hasNext()) {
                  if (iterator.next() < map.get(c)) {
                     iterator.remove();
                  }
                }

                map.remove(c);
                map.put(c, len);
            }
            if (len > maxLen) maxLen = len;
        }
        
        return maxLen;
    }
}