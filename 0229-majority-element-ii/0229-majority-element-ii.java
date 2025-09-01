class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length/3;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int num:nums) {
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:mpp.entrySet()) {
            if(entry.getValue()>n) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}