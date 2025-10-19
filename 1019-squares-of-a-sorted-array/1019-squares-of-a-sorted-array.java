class Solution {
    public int[] sortedSquares(int[] nums) {
        int neg_indx=-1;
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            if(nums[i]>=0)break;
            i++;
        }
        int k=i-1;int l=i;
        for(int a=0;a<n;a++)
        {
            nums[a]=(int)Math.pow(nums[a],2);
        }
        int res[]=new int[n];
        int j=0;
        while(k>=0 && l<n)
        {
            if(nums[k]<nums[l])
            {
                res[j]=nums[k];
                k--;j++;
            }
            else if(nums[l]<nums[k])
            {
                res[j]=nums[l];
                j++;l++;
            }
            else
            {
                res[j]=nums[k];
                k--;j++;
            }
        }
        while(j<n && k>=0)
        {
            res[j]=nums[k];
            k--;j++;
        }
        while(j<n && l<n)
        {
            res[j]=nums[l];
            j++;l++;
        }
        return res;
    }
}