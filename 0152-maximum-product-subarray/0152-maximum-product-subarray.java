class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1,suffix=1;
        int maxprod=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1;
            prefix=prefix*nums[i];
            suffix=suffix*nums[n-i-1];
            maxprod=Math.max(maxprod,Math.max(prefix,suffix));

        }
        return maxprod;
    }
}