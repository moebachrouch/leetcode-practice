class Solution {
    public boolean isPalindrome(int x) {
        // If x is negative then it cannot be a palindrome
        if (x < 0) return false;
        
        // Obtain the power of x using the log
        // Ex: the power of 121 is 2
        int power = (int)Math.log10(x);

        // Use a copy of x in order to avoid modifying x
        int copy = x;
        
        int i = power;
        int j = 0;
        
        while (x!= 0) {
            int lower = x / (int)(Math.pow(10, i));
            x -= lower * (int)Math.pow(10, i);
            int higher = copy % 10;
            copy = copy / 10;
            
            System.out.println(lower);
            System.out.println(higher);
            
            System.out.println();
            
            if (lower != higher) return false;
        
            
            i--;
            j++;
        }
        return true;
    }
}