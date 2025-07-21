class Solution {
    public int maxArea(int[] height) {
        int fdistance=0;
        int i=0,j=height.length-1;
        while(i<j)
        {
            int distance=Math.min(height[i],height[j])*(j-i);
            fdistance=Math.max(distance,fdistance);
            if(height[i]<height[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
        return fdistance;

    }
}