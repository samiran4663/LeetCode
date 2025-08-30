class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return recfunc(grid, 0, 0,dp);
    }

    public int recfunc(int [][] grid, int down, int right,int dp[][]) {
        
        if(down>=grid.length || right==grid[0].length) return Integer.MAX_VALUE;
        if(down==grid.length-1 && right==grid[0].length-1)
        {
            return grid[down][right];
        }
        if(dp[down][right]!=-1) return dp[down][right];
        int downsum=recfunc(grid,down+1,right,dp);
        if(downsum!=Integer.MAX_VALUE)
        {
            downsum+=grid[down][right];
        }
        int rightsum=recfunc(grid,down,right+1,dp);
        if(rightsum!=Integer.MAX_VALUE)
        {
            rightsum+=grid[down][right];
        }
        return dp[down][right]=Math.min(downsum,rightsum);
        
    }
}
