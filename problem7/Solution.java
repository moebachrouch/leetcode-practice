class Solution {
    public int reverse(int x) {
        
        // Here we store the result
        long res = 0;
        while (x != 0) {
            // We extract the least significant digit each time
            // Example: 123 % 10 will yield 3 on the first iteration
            long rem = x % 10;
            x = x / 10;

            // We add the remainder to the resulting number. At the same time,
            // we multiply the resulting number by 10 before we add the remainder.
            // That way, we avoid the previous problem of having to count the "order"
            // or "power" of the digit that we are trying to reverse. Here, we simply
            // keep multiplying the result by 10, then add the remainder to it until
            // x becomes 0. This will automatically result in a number of the desired
            // order. Example:
            // 120 will yield:
            // 0 * 10 + 0
            // 0 * 10 + 2
            // 2 * 10 + 1
            // which is 021, or simply 21 which is what we want.
            // We are iteratively increasing the order of the result, the number of times
            // that we are reducing x until we reach 0.
            res = res * 10 + rem;

            // We "reduce" our number by dividing it by 10
            // Example: 123 / 10 yields 12, then 1 etc.
            // Decrease the power counter
            powerCtr--;
        }
        
        // We respect the bounds given by the problem
        if ( (res < -(long)(Math.pow(2, 31)) ) 
            || (res > (long)(Math.pow(2, 31)) - 1) ) return 0;
        
        return (int)res;
    }
}