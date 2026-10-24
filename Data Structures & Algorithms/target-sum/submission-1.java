class Solution {

    HashMap<String, Integer> map=new HashMap<>();
    private int ways(int[] nums, int idx, int target)
    {
        if(idx==0)
        {
            int w=0;
            if(target-nums[0]==0) w++;
            if(target+nums[0]==0) w++;
            return w;
        }

        String str=""+idx+" "+target;
        if(map.containsKey(str)) return map.get(str);

        int plus=ways(nums, idx-1, target+nums[idx]);
        int minus=ways(nums, idx-1, target-nums[idx]);
        int result=plus+minus;
        map.put(new String(""+idx+" "+target), result);
        return result;
    }
    public int findTargetSumWays(int[] nums, int target) 
    {
        int n=nums.length;
        map.clear();
        return ways(nums, n-1, target);
    }
}
