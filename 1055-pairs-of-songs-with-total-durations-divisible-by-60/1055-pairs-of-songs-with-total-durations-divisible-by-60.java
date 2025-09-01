class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        long count = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int num:time) {
            int rem = num%60;
            int temp = (60-rem)%60;

            if(mpp.containsKey(temp)) {
                count+=mpp.get(temp);
            }
            mpp.put(rem,mpp.getOrDefault(rem,0)+1);
        }
        return (int) count;
    }
}