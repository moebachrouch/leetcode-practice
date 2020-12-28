class Solution {
    public int lengthOfLongestSubstring(String s) {
        // The current length of the substring 
        int len = 0;

        // The largest length of the substring, to be returned at the end
        int maxLen = 0;

        // Counts where we are in the string
        int lenCtr = 0;
        
        // HashMap for O(1) lookup when inserting characters and looking for duplicates
        Map<Character, Integer> map = new HashMap<>();
        
        // Loop through the substring
        for (int i = 0; i < s.length(); i++){
            // Extract the current character
            char c = s.charAt(i);        
            
            // If the character is not contained in the current substring being considered
            if (!map.containsKey(c)) {

                // Put this character in the hashmap and increase the length of the current subtring by 1
                // The value associated with this character is the index that we are currently at in the
                // string s. This will help us when computing the length of the current substring later
                map.put(c, lenCtr);
                len++;

            // If the character has been found in the current substring
            } else {
                // Remove all characters that were found prior to the duplicate of the
                // character being considered. We start over at a new substring
                Iterator<Integer> iterator = map.values().iterator();
                while (iterator.hasNext()) {
                  if (iterator.next() < map.get(c)) {
                     iterator.remove();
                  }
                }

                // We compute the length of the current substring. To do this,
                // we simply subtract the lenCtr at the duplicate from the current
                // lenCtr
                len = lenCtr - map.get(c);

                // Replace the current character's duplicate's value with the newest value
                // aka, the newest lenCtr. We are further in the string now
                map.put(c, lenCtr);
            }
            
            // Replace the maxLen with the newest longest length
            if (len > maxLen) maxLen = len;

            // Increase lenCtr to keep track of where we are in the string
            lenCtr++;
        }
        
        // Return the longest substring length
        return maxLen;
    }
}