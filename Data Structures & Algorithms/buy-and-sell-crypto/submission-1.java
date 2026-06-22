class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxp = 0; 

        for(int sell: prices){
            maxp = Math.max(maxp, sell - minBuy); 
            minBuy = Math.min(minBuy, sell);
        }
        return maxp; 
    }
}
