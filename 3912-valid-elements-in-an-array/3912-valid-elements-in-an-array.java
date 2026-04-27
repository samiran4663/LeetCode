class Solution {
    public List<Integer> findValidElements(int[] nums) 
    {
        int leftgrt=nums[0];
        int n=nums.length;
        List<Integer> validElements=new ArrayList<>();
        if(nums.length>2)
        {
            validElements.add(nums[0]);
            for(int i=1;i<n-1;i++)
            {
                if(nums[i]>leftgrt)
                {
                    validElements.add(nums[i]);
                    leftgrt=nums[i];
                }
                else
                {
                    int rightgrt=nums[n-1];
                    for(int j=n-2;j>i;j--)
                    {
                        rightgrt=Math.max(nums[j],rightgrt);
                    }
                    if(nums[i]>rightgrt) validElements.add(nums[i]);
                }
            }
            validElements.add(nums[n-1]);
        }
        else if(nums.length==2)
        {
            validElements.add(nums[0]);
            validElements.add(nums[n-1]);
        }
        else if(nums.length==1)
        {
            validElements.add(nums[n-1]);
        }
        return validElements;
    }
}