class Solution {

    private boolean isPossible(int[] piles, int speed, int h)
    {
        int hours=0;
        for(int i=0;i<piles.length;i++)
        {
            hours+=(piles[i]+speed-1)/speed;
            if(hours>h)return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h)
    {
        int n=piles.length;

        int max=piles[0];
        for(int i:piles)
        {max=Math.max(max, i);}

        int low=1, high=max;
        int ans=-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(isPossible(piles, mid, h))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}
