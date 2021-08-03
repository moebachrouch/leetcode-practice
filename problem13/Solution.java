import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int integer = map.get(c);

            res += integer;
            if (i > 0) {
                char previousChar = s.charAt(i - 1);
                int previousInteger = map.get(previousChar);
                if (integer > previousInteger) {
                    res -= previousInteger;
                    i--;
                } 
            }
        }

        return res;
    }
}
