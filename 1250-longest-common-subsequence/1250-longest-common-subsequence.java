class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int indx1=text1.length()-1;
        int indx2=text2.length()-1;
        int dp[][]=new int[indx1+1][indx2+1];
        for(int i=0;i<text1.length();i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return recfunc(indx1,indx2,dp,text1,text2);
    }
    public int recfunc(int indx1,int indx2,int dp[][],String text1,String text2)
    {
        if(indx1<0 || indx2<0) return 0;
        if(dp[indx1][indx2]!=-1) return dp[indx1][indx2];
        if(text1.charAt(indx1)==text2.charAt(indx2)){
            return dp[indx1][indx2]=1+recfunc(indx1-1,indx2-1,dp,text1,text2);
        }
        return dp[indx1][indx2]=Math.max(recfunc(indx1-1,indx2,dp,text1,text2),recfunc(indx1,indx2-1,dp,text1,text2));
    }
    
}