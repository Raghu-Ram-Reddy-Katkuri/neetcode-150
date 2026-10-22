class Solution {

    private int fn(int[] nums)
    {
        int n=nums.length;

        int[] dp=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            int not_take=dp[i-1];
            int take=nums[i];
            if(i-1>0) take+=dp[i-2];
            dp[i]=Math.max(take, not_take);
        }
        return dp[n-1];
    }

    public int rob(int[] nums) 
    {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];

        int[] t1=new int[n-1];
        int[] t2=new int[n-1];

        for(int i=0;i<n-1;i++) t1[i]=nums[i];
        for(int i=1;i<n;i++) t2[i-1]=nums[i];

        return Math.max(fn(t1), fn(t2));
    }
}
