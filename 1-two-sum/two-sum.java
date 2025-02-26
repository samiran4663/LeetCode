class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int n=nums.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!mpp.containsKey(target-nums[i])){
                mpp.put(nums[i],i);
            }
            else{
                arr[0]=mpp.get(target-nums[i]);
                arr[1]=i;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}