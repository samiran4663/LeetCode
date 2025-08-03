class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int [][]dp = new int [n][n+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return recfunc(nums,0,-1,dp);
    }
    public int recfunc(int nums[],int indx,int previndx,int[][] dp)
    {
        if(indx==nums.length) return 0;
        if (dp[indx][previndx+1]!=-1)return dp[indx][previndx+1];
        int len = 0 + recfunc(nums,indx+1,previndx,dp);
        if(previndx == -1 || nums[indx] > nums[previndx]){
            len = Math.max(len,1 + recfunc(nums,indx+1,indx,dp)) ;
        }
        dp[indx][previndx+1]=len;
        return dp[indx][previndx+1];
    }
}