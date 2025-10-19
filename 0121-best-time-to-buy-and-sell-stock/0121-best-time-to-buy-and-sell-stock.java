class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max_profit=0;
        int cp=prices[0];
        for(int i=1;i<n;i++)
        {
            if(prices[i]>cp)
            {
                int profit=prices[i]-cp;
                max_profit=Math.max(profit,max_profit);
            }
            else if(prices[i]<=cp)
            {
                cp=prices[i];
            }
        }
        return max_profit;
    }
    
}