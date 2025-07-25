class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    
        Arrays.sort(candidates);
        int indx=0;
        List<Integer>list1=new ArrayList<>();
        List<List<Integer>>ls=new ArrayList<>();
        comsum2(candidates,target,indx,list1,ls);
        return new ArrayList<>(ls);
    }
    public void comsum2(int candidates[],int target,int indx,List<Integer> list1,List<List<Integer>>ls)
    {
       if(target==0)
            {
                ls.add(new ArrayList<>(list1));
                return;
            }
        for(int i=indx;i<candidates.length;i++)
        {
            if(i>indx && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;

            list1.add(candidates[i]);
            comsum2(candidates,target-candidates[i],i+1,list1,ls);
            list1.remove(list1.size()-1);
        }
        
    }
}