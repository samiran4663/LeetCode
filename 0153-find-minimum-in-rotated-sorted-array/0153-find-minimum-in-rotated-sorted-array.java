class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return binarysearch(nums,0,n-1);
    }
    public int binarysearch(int arr[],int low,int high)
    {
        if(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid+1])
            {
                return arr[mid+1];
            }
            else if(arr[mid]>arr[arr.length-1])
            {
                return binarysearch(arr,mid+1,high);
            }
            else{
                return binarysearch(arr,low,mid-1);
            }
        }
        return arr[0];
    }
}