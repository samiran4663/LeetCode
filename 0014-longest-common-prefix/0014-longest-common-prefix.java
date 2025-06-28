class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int len=strs.length;
        int strlen=strs[0].length();
        for(int i=0;i<strlen;i++)
        {
            for(int j=1;j<len;j++)
            {
                if(i>=strs[j].length() || (strs[j].charAt(i)!=strs[0].charAt(i))) return ans;
            }
            ans=ans+strs[0].charAt(i);
        }
        return ans;
    }
}