class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list1=new ArrayList<>();
        List<List<Integer>> ls= new ArrayList<>();
        int indx=0;
        reccomsum(candidates,list1,ls,indx,target);
        return ls;
    }
    public void reccomsum(int [] candidates, List<Integer>list1,List<List<Integer>> ls,int indx,int target)
    {
       if(indx==candidates.length)
       {
            if(target==0)
            {
                ls.add(new ArrayList<>(list1));
            }
            return;
        }
        if(candidates[indx]<=target)
        {
            list1.add(candidates[indx]);
            reccomsum(candidates,list1,ls,indx,target-candidates[indx]);
            list1.remove(list1.size()-1);
        }
        reccomsum(candidates,list1,ls,indx+1,target);
    }
}