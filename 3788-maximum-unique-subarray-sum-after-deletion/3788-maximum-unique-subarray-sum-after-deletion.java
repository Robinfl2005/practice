class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums)
        set.add(num);
        int max=Integer.MIN_VALUE;
        for(int num:set) {
            if(num>max)
            max=num;
        }
        int ans=0;
        if(max<0)
        ans=max;
        else {
            for(int num:set) {
                if(num>0)
                ans+=num;
            }
        }
        return ans;
    }
}