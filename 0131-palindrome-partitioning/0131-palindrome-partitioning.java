class Solution {
    public List<List<String>> partition(String s) {
        int indx=0;
        List<List<String>> ans=new ArrayList<>();
        palindromepartition(s,indx,ans,new ArrayList<>());
        return ans;
    }
    public boolean ispalindrome(String s,int strindx,int endindx)
    {
        if(strindx==endindx) return true;
        while(strindx<=endindx)
        {
            if(s.charAt(strindx)!=s.charAt(endindx)) return false;
            strindx++;endindx--;
        }
        return true;
    }
    public void palindromepartition(String s,int indx,List<List<String>> ans,List<String> ls)
    {
        if(indx==s.length())
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i=indx;i<s.length();i++)
        {
            if(ispalindrome(s,indx,i)){
                ls.add(s.substring(indx,i+1));
                palindromepartition(s,i+1,ans,ls);
                ls.remove(ls.size()-1);
            }
        }
    }
}