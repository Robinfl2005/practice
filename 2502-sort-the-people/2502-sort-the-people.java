class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> mpp = new HashMap<>();
        for(int i=0;i<names.length;i++) {
            mpp.put(heights[i],names[i]);
        }
        for(int i=0;i<heights.length-1;i++) {
            for(int j=0;j<heights.length-i-1;j++) {
                if(heights[j]<heights[j+1]) {
                    int temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;
                }
            }
        }
        String[]res = new String[names.length];
        for(int i=0;i<heights.length;i++) {
            res[i] = mpp.get(heights[i]);
        }
        return res;
    }
}