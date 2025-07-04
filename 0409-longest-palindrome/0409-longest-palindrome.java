class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        HashMap<Character,Integer> mpp = new HashMap<>();
        int length=0;
        for(int i=0;i<s.length();i++)
        {
            mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
        }
        boolean hasodd=false;
        for(Map.Entry<Character,Integer> m:mpp.entrySet())
        {
            if(m.getValue()%2==0){
                length+=m.getValue();
            }
            else{
                length+=m.getValue()-1;
                hasodd=true;
            }
            
        }
        if(hasodd) length+=1;
        return length;


    }
}