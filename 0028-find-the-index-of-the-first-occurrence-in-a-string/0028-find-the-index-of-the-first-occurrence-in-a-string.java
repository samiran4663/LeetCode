class Solution {
    public int strStr(String haystack, String needle) 
    {
        int haystack_len=haystack.length();
        int needle_len=needle.length();
        int i=0;
        while(i+needle_len<=haystack_len && i<haystack_len)
        {
            if(haystack.substring(i,i+needle_len).equals(needle))
            {
                return i;
            }
            i++;
        }
        return -1;

        
    }
}