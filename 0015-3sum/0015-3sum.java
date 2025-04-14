class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            Set<Integer> hst=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int third=-(nums[i]+nums[j]);
                if(hst.contains(third))
                {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                hst.add(nums[j]);
            }
        }
        List<List<Integer>> ans =new ArrayList<>(st);
        return ans;
    }
}