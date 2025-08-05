class Solution {
    public int climbStairs(int n) {
        int steps=0;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return recclimb(n,steps,dp);
    }
    public int recclimb(int n,int steps,int dp[])
    {
        if(n==0) return 1;
        int v1=recclimb(n-1,steps+1,dp);
        int v2=0;
        if(dp[n]!=-1) return dp[n];
        if(n>=2)
        {
            v2=recclimb(n-2,steps+2,dp);
        }
        return dp[n]=v1+v2;
    }
}