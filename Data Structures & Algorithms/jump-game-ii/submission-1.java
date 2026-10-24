class Solution {
    public int jump(int[] nums) 
    {
        int r=0, l=0, steps=0;
        while(r<nums.length-1)
        {
            steps++;
            int max=0;
            for(int i=l;i<=r;i++)
            {
                max=Math.max(i+nums[i], max);
            }
            l=r+1;
            r=max;
        }
        return steps;
        
    }
}
