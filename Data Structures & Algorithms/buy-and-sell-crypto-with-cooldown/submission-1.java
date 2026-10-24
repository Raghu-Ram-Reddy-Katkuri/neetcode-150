class Solution {

    private int fn(int[] prices, int i, int buy)
    {
        if(i>=prices.length) return 0;

        if(buy==1)
        {
            return Math.max( -prices[i] + fn(prices, i+1, 0), fn(prices, i+1, 1));
        }
        else
        {
            return Math.max( prices[i] + fn(prices, i+2, 1), fn(prices, i+1, 0));
        }
    }
    public int maxProfit(int[] prices) 
    {
        // return fn(prices, 0, 1);
        int n=prices.length;

        int[][] dp=new int[n+2][2];

        for(int i=n-1;i>=0;i--)
        {
            for(int buy=0;buy<=1;buy++)
            {
                if(buy==1)
                {
                    dp[i][buy]=Math.max( -prices[i] + dp[i+1][0], dp[i+1][1]);
                }
                else
                {
                    dp[i][buy]=Math.max( prices[i]+ dp[i+2][1], dp[i+1][0]);
                }
            }
        }

        return dp[0][1];
    }

}
