class Solution {
    public int maxProfit(int[] prices) {
       int minBuy = prices[0];
       int maxSell = 0; 

       for(int sell: prices){
        maxSell = Math.max(maxSell, sell - minBuy);
        minBuy = Math.min(minBuy, sell); 
       }
       return maxSell; 
    }
}
