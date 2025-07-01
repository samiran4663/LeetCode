class Solution {
    public int strStr(String haystack, String needle) {
        int start=-1;
        if(needle.length()==0 || needle.length()>haystack.length()) return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                start=i;
                int indx=1,flag=1;
                for(int j=start+1;j<start+needle.length();j++)
                {
                    if(haystack.charAt(j)!=needle.charAt(indx++)){
                        flag=0;
                        break;
                    }
                }
                if(flag==1) return start;
            }
        }
        return -1;
        
    }
}