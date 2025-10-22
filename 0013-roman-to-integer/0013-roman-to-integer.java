class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        mpp.put('I',1);
        mpp.put('V',5);
        mpp.put('X',10);
        mpp.put('L',50);
        mpp.put('C',100);
        mpp.put('D',500);
        mpp.put('M',1000);
        int i=0;int res=0;
        while(i<s.length())
        {
            if(i+1<s.length() && s.charAt(i)=='I')
            {
                if(s.charAt(i+1)=='V')
                {
                    res+=4;
                    i+=2;
                }
                else if(s.charAt(i+1)=='X')
                {
                    res+=9;
                    i+=2;
                }
                else
                {
                    res+=mpp.get(s.charAt(i));
                    i++;
                }
                
            }
            else if(i+1<s.length() && s.charAt(i)=='X')
            {
                if(s.charAt(i+1)=='L')
                {
                    res+=40;
                    i+=2;
                }
                else if(s.charAt(i+1)=='C')
                {
                    res+=90;
                    i+=2;
                }
                else
                {
                    res+=mpp.get(s.charAt(i));
                    i++;
                }
                
            }
            else if(i+1<s.length() && s.charAt(i)=='C')
            {
                if(s.charAt(i+1)=='D')
                {
                    res+=400;
                    i+=2;
                }
                else if(s.charAt(i+1)=='M')
                {
                    res+=900;
                    i+=2;
                }
                else
                {
                    res+=mpp.get(s.charAt(i));
                    i++;
                }
                
            }
            else
            {
                res+=mpp.get(s.charAt(i));
                i++;
            }
        }
        return res;
    }
}