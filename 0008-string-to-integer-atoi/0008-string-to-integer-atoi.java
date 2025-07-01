class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int i=0,sign=1;
        long result=0;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
            result=result*10+(s.charAt(i)-'0');
            if(sign*result<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else if(sign*result>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;

        }
        return (int)(sign*result);
        

    }
}