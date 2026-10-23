class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int n=nums.length;
        int[] ans=new int[n-k+1];

        int l=0, i=0;
        Deque<Integer> dq=new ArrayDeque<>();

        for(int r=0;r<n;r++)
        {
            if(!dq.isEmpty() && dq.peekFirst()<=r-k) dq.pollFirst();

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[r])
            {
                dq.pollLast();
            }
            dq.offerLast(r);

            if(r>=k-1)
            {
                ans[i++]=nums[dq.peekFirst()];
            }
        }
        return ans;
        
    }
}
