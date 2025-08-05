class Solution {
    public int maxProfit(int[] prices) {
        return maxrecprofit(0,Integer.MAX_VALUE,prices);
    }
    public int maxrecprofit(int indx,int min_price,int prices[])
    {
        if(indx==prices.length) return 0;
        min_price=Math.min(min_price,prices[indx]);
        int profit=prices[indx]-min_price;
        return Math.max(profit,maxrecprofit(indx+1,min_price,prices));
    }
}