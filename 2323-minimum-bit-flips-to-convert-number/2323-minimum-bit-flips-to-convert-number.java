class Solution {
    public int minBitFlips(int start, int goal) {
        int resultant=start^goal;
        int cnt=0;
        while(resultant!=0)
        {
            cnt+=(resultant&1);
            resultant=resultant>>1;
        }
        return cnt;
    }
}