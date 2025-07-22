class Solution {
    public int jump(int[] nums) {
            int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest we can reach from here
            farthest = Math.max(farthest, i + nums[i]);

            // When we reach the end of the current jump,
            // we must make another jump
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}