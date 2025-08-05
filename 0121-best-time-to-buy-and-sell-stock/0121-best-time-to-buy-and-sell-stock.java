class Solution {
    public int maxProfit(int[] prices) {
        int dp[]=new int[prices.length];
        Arrays.fill(dp,-1);
        return maxrecprofit(0,Integer.MAX_VALUE,prices,dp);

    }
    public int maxrecprofit(int indx,int min_price,int prices[],int dp[])
    {
        if(indx==prices.length) return 0;
        if(dp[indx]!=-1) return dp[indx];
        min_price=Math.min(min_price,prices[indx]);
        dp[indx]=prices[indx]-min_price;
        return Math.max(dp[indx],maxrecprofit(indx+1,min_price,prices,dp));
    }
}