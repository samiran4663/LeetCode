class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>merged= new ArrayList<>();
        int n=intervals.length;
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<n;i++)
        {
            int nextstart=intervals[i][0];
            int nextend=intervals[i][1];
            if(nextstart<=end)
            {
                end=Math.max(end,nextend);
            }
            else{
                merged.add(new int[]{start,end});
                start=nextstart;
                end=nextend;
            }
        }
        merged.add(new int[]{start,end});
        return merged.toArray(new int[merged.size()][]);
    }
}