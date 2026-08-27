class Solution {
    public int maxProfit(int[] prices) {
        // If the first number is the largest in the array, then compare the next elements
        // Take the lowest element we then see, and then subtract it from the highest element we see from our modified set. 
        // The different day we choose MUST be a different "forward" index, cannot go backwards

        int buyPointer = 0; // starts at index 0, and tells us when to buy
        int sellPointer = 1; // starts at index 1 because it MUST be a different index
        int maxProfit = 0;
        while (sellPointer < prices.length) {
            if (prices[buyPointer] > prices[sellPointer]) {
                buyPointer = sellPointer;
            } else {
                int difference = prices[sellPointer] - prices[buyPointer];
                maxProfit = Math.max(difference, maxProfit);
            }
            sellPointer++;
        }
        return maxProfit;
    }
}
