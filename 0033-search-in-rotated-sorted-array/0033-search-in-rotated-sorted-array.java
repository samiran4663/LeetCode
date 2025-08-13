class Solution {
    public int search(int[] nums, int target) {
        int pivot=pivotsearch(nums,0,nums.length-1);
        if(target>=nums[0] && target<=nums[pivot]) return binarysearch(nums,0,pivot,target);
        else if(target<=nums[nums.length-1] && target<=nums[pivot]) 
        {
            return binarysearch(nums,pivot+1,nums.length-1,target);
        }
        else if(pivot == 0) return binarysearch(nums,0,nums.length-1,target);
        return -1;
    }
    public int pivotsearch(int nums[],int left,int right)
    {
        
        if(left<=right)
        {
            int mid=left+(right-left)/2;
            if(mid+1<nums.length && nums[mid]>nums[mid+1]) return mid;

            else if(nums[mid]>nums[nums.length-1])
            {
                return pivotsearch(nums,mid+1,right);
            }
            else if(nums[mid]<nums[0])
            {
                return pivotsearch(nums,left,mid-1);
            }
        }
        return 0;
    }
    public int binarysearch(int nums[],int left,int right,int target)
    {
        if(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;
            else if(target>nums[mid]) return binarysearch(nums,mid+1,right,target);
            else return binarysearch(nums,left,mid-1,target);
        }
        return-1;
    }
    
}