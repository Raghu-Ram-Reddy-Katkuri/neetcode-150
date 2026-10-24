class Solution {
    public boolean canJump(int[] nums) 
    {
        int max_index=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(max_index<i) return false;
            max_index=Math.max(max_index, i+nums[i]);
        }
        return true;
    }
}
