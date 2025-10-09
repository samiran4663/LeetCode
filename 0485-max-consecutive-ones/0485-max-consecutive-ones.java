class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxlen=-1;
        int n=nums.length;
        int len=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                len++;
            }
            else
            {
                maxlen=Integer.max(len,maxlen);
                len=0;
            }
        }
        maxlen=Integer.max(len,maxlen);
        return maxlen;
    }
}