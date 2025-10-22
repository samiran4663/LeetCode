class Solution {
    public String longestCommonPrefix(String[] strs) {
        String smallest="";
        int smallest_size=Integer.MAX_VALUE;
        for(String s:strs)
        {
            if(s.length()==0)
            {
                return "";
            }
            else if(s.length()>0 && s.length()<smallest_size)
            {
                smallest_size=s.length();
                smallest=s;
            }
        }
        StringBuilder prefix=new StringBuilder();
        boolean flag=true;
        for(int i=0;i<smallest_size;i++)
        {
            for(String str:strs)
            {
                if(str.charAt(i)!=smallest.charAt(i))
                {
                    flag=false;
                    break;
                }
            }
            if(flag==false)
            {
                if(prefix.length()==0)
                {
                    prefix.append("");
                }
                break;
            }
            else
            {
                prefix.append(smallest.charAt(i));
            }
        }
        return prefix.toString();
        
    }
}