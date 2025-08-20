class Solution {
    public int divide(int dividend, int divisor) {
        
        long absdividend=Math.abs((long)dividend);
        long absdivisor=Math.abs((long)divisor);
        boolean sign=true;
        if(dividend<0 && divisor>0) sign=false;
        else if(dividend>0 && divisor<0) sign=false;
        long sum=0;
        while(absdividend>=absdivisor)
        {
            int cnt=0;
            while(absdividend>=absdivisor<<(cnt+1))
            {
                cnt++;
            }
            sum+=(1L<<cnt);
            absdividend-=absdivisor<<cnt;
        }
        if(sum>=Integer.MAX_VALUE && sign==true) return Integer.MAX_VALUE;
        else if(sum>Integer.MAX_VALUE && sign==false ) return Integer.MIN_VALUE;
        return sign?(int)sum:(int)(-1*sum);
  
    }
}