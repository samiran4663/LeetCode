class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int low=0;
        int high=nums.length-1;
        return binarysearch(nums,low,high,target);
    }
    public int binarysearch(int nums[] , int low,int high,int target)
    {
        if(low<=high)
        {
            int mid=(low+high)/2;
            if(target<nums[mid]) return binarysearch(nums,low,mid-1,target);
            else if(target>nums[mid]) return binarysearch(nums,mid+1,high,target);
            else return mid;
        }
        return high+1;
    }
}