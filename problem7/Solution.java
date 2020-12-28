class Solution {
    public int reverse(int x) {
        
        long test = x;
        long powerCtr = 0;
        while (test != 0) {
            test /= 10;
            powerCtr++;
        }
        
        System.out.println(powerCtr);
        
        long res = 0;
        while (powerCtr != 0) {
            long rem = x % 10;
            System.out.println(rem);
            res = res + rem * (long)Math.pow(10, powerCtr - 1);
            System.out.println(res);
            x = x / 10;
            powerCtr--;
        }
        
        if ( (res < -(long)(Math.pow(2, 31)) ) 
            || (res > (long)(Math.pow(2, 31)) - 1) ) return 0;
        
        return (int)res;
    }
}