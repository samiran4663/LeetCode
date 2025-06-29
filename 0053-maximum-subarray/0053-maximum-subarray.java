class Solution {
    public int maxSubArray(int[] nums) {
        int i,j;
        int n=nums.length;
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
            if(sum>max_sum){
                max_sum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max_sum;
    }
}