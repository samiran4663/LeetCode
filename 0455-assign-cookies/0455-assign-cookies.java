class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt=0;
        int indx=-1;
        for(int i=0;i<g.length;i++)
        {
            for(int j=indx+1;j<s.length;j++)
            {
                if(s[j]>=g[i])
                {
                    cnt++;
                    indx=j;
                    break;
                }
            }
        }
        return cnt;
    }
}