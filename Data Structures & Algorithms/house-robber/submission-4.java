class Solution {

    private int fn(int[] nums, int i)
    {
        if(i==0) return nums[i];

        int not_take=fn(nums, i-1);
        int take=Integer.MIN_VALUE;
        if(i-2>=0) take=nums[i] + fn(nums, i-2);
        return Math.max(take, not_take);
    }
    public int rob(int[] nums)
    {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            int take=nums[i];
            int not_take=dp[i-1];
            if(i-2>=0) take+=dp[i-2];
            dp[i]=Math.max(take, not_take);
        }
        return dp[n-1];
    }
}
