class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean freq [] = new boolean [nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        permutegen(nums,ans,new ArrayList<>(),freq);
        return ans;
    }
    public void permutegen(int [] nums,List<List<Integer>>ans,List<Integer>ls,boolean freq [])
    {
        if(ls.size()==nums.length)
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i]){
                freq[i]=true;
                ls.add(nums[i]);
                permutegen(nums,ans,ls,freq);
                ls.remove(ls.size()-1);
                freq[i]=false;
            }
        }
    }
}