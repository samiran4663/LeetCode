class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int bit_indx=0;bit_indx<=31;bit_indx++)
        {
            int cnt=0;
            for(int i=0;i<nums.length;i++)
            {
                if((nums[i]&(1<<bit_indx))!=0)
                {
                    cnt++;
                }
            }
            if(cnt%3==1)
            {
                ans=ans|(1<<bit_indx);
            }
        }
        return ans;
    }
}