class Solution {
    public int reverse(int x) {
        int power = (int)Math.log10(Math.abs(x)) + 1;
        System.out.println(power);
    
        long res = 0;
        while (power != 0) {
            long rem = x % 10;
            res = res + rem * (long)Math.pow(10, power - 1);
            x = x / 10;
            power--;
        }
        
        if ( (res < -(long)(Math.pow(2, 31)) ) 
            || (res > (long)(Math.pow(2, 31)) - 1) ) return 0;
        
        return (int)res;
    }
}