class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int n=nums.length;
        int maxindx=0;
        while(i<=maxindx)
        {
            maxindx=Math.max(maxindx,i+nums[i]);
            if(maxindx>=n-1) return true;
            else if(i>maxindx) break;
            i++;
        }
        return false;
    }
}