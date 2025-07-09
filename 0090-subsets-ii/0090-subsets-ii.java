class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> rows = new ArrayList<>();
        int indx=0;
        recsubset(nums,indx,rows,result);
        return result;
    }
    public void recsubset(int nums [],int indx, List<Integer> list1,         List<List<Integer>> ls)
    {
        if(indx==nums.length)
        {
            if(!ls.contains(list1))ls.add(new ArrayList<>(list1));
            return;
        }
        list1.add(nums[indx]);
        recsubset(nums,indx+1,list1,ls);
        list1.remove(list1.size()-1);
        recsubset(nums,indx+1,list1,ls);

    }
}