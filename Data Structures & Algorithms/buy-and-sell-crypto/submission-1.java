class Solution {
    public int maxProfit(int[] prices) {
        int buyPointer = 0;
        int sellPointer = 1; // sell in a different day
        int[] profitsArray = new int[prices.length - 1];
        while (sellPointer < prices.length) {
            if (prices[buyPointer] > prices[sellPointer]) {
                buyPointer = sellPointer; // finds the correct location for buyPointer
            } 
            int difference = prices[sellPointer] - prices[buyPointer];
            profitsArray[sellPointer - 1] = difference;
            sellPointer++;
        }
        int maxProfit = profitsArray[0];
        for (int i = 1; i < profitsArray.length; i++) {
            if (profitsArray[i] > maxProfit) {
                maxProfit = profitsArray[i];
            }
        }
        return maxProfit;
    }
}
