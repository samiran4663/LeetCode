class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        String ans="";
        int startindx,endindx;
        for(int i=n-1;i>=0;)
        {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            startindx=i;
            endindx=i;
            while(i>=0 && s.charAt(i)!=' ')
            {
                i--;
                startindx--;
            }
            ans+=s.substring(startindx+1,endindx+1);
            ans+=' ';
            if(i>=0) i--;
        }
        return ans.trim();

    }
}