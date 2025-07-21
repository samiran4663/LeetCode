class Solution {
    public int maxProfit(int[] prices) {
        int totalprofit=0;
        for(int i=0;i<prices.length-1;i++)
        {
            int j=i+1;
            if(prices[j]>prices[i])
            {
                totalprofit+=prices[j]-prices[i];
            }
        }
        return totalprofit;
    }
}