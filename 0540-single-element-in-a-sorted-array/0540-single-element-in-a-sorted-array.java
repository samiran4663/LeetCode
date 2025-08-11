class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        return binarysearch(nums,0,nums.length-1);
    }
    public int binarysearch(int [] nums,int left,int right)
    {
        if(left<=right)
        {
            int mid=left+(right-left)/2;
            if(mid==0)
            {
                if(nums[mid]!=nums[mid+1]) return nums[mid];
            }
            else if(mid==nums.length-1)
            {
                if(nums[mid]!=nums[mid-1]) return nums[mid];
            }
            else if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            else if(mid%2==0 && nums[mid]==nums[mid+1] || mid%2!=0 && nums[mid]==nums[mid-1])
            {
                return binarysearch(nums,mid+1,right);
            }
            else if(mid%2==0 && nums[mid]==nums[mid-1] || mid%2!=0 && nums[mid]==nums[mid+1])
            {
                return binarysearch(nums,left,mid-1);
            }
        }
        return -1;
    }
}