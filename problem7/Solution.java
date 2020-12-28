class Solution {
    public int reverse(int x) {
        
        // We first find the power of the number that we
        // are trying to reverse. For example, for 123
        // We will find 3 and eventually we will subtract 1
        long test = x;
        long powerCtr = 0;
        while (test != 0) {
            // We keep dividing until we reach 0
            test /= 10;
            powerCtr++;
        }
        
        // Here we store the result
        long res = 0;
        while (powerCtr != 0) {
            // We extract the least significant digit each time
            // Example: 123 % 10 will yield 3 on the first iteration
            long rem = x % 10;

            // We add the least significant digit multiplied
            // by the decreasing power of 10, and add it to the result
            // Example: 123 will yield res = 0 + 3*10^2 on the first iteration,
            // which is 300. On the second iteration we will get 320, and on
            // the final iteration we obtain 321
            res = res + rem * (long)Math.pow(10, powerCtr - 1);

            // We "reduce" our number by dividing it by 10
            // Example: 123 / 10 yields 12, then 1 etc.
            x = x / 10;

            // Decrease the power counter
            powerCtr--;
        }
        
        // We respect the bounds given by the problem
        if ( (res < -(long)(Math.pow(2, 31)) ) 
            || (res > (long)(Math.pow(2, 31)) - 1) ) return 0;
        
        return (int)res;
    }
}