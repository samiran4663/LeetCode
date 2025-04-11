class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int k=set.size();
        int i=0;
        for(Integer num : set)
        {
            nums[i++]=num;
        }
        return k;
    }
}