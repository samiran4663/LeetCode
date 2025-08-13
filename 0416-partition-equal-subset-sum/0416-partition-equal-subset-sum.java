class Solution {
    public boolean canPartition(int[] nums) {
        int total_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            total_sum+=nums[i];
        }
        if(total_sum%2!=0) return false;
        int target=total_sum/2;
        int dp[][]=new int[nums.length][target+1];
        for(int i=0;i<nums.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return recfunc(nums,nums.length-1,target,dp);

    }
    public boolean recfunc(int nums[],int indx,int target,int dp[][])
    {
        if(target==0) return true;
        if(indx==0) return nums[indx]==target;
        if(dp[indx][target]!=-1)
        {
            return dp[indx][target]==1?true:false;
        }
        boolean nottake=recfunc(nums,indx-1,target,dp);
        boolean taken=false;
        if(nums[indx]<=target)
        {
            taken=recfunc(nums,indx-1,target-nums[indx],dp);
        }
        dp[indx][target]=nottake||taken?1:0;
        return nottake||taken;
    }
    
    
}