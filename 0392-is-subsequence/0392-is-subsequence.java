class Solution {
    public boolean isSubsequence(String s, String t) {
        int indx1=s.length()-1;
        int indx2=t.length()-1;
        int dp[][]=new int[indx1+1][indx2+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int count=recfunc(indx1,indx2,dp,s,t);
        if (count==s.length()) return true;
        
        return false;
        
    }
    public int recfunc(int indx1,int indx2,int dp[][],String s,String t)
    {
        
        if(indx1<0 || indx2<0) return 0;
        if(dp[indx1][indx2]!=-1) return dp[indx1][indx2];
        if(s.charAt(indx1)==t.charAt(indx2)){
           return dp[indx1][indx2]=1+recfunc(indx1-1,indx2-1,dp,s,t);
            
        }
        return dp[indx1][indx2]=Math.max(recfunc(indx1-1,indx2,dp,s,t),recfunc(indx1,indx2-1,dp,s,t));
    }
}