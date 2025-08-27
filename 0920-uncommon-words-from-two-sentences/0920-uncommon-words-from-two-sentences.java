class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[]arr1=s1.split(" ");
        String[]arr2=s2.split(" ");

        HashMap<String,Integer> mpp=new HashMap<>();
        for(String s:arr1) {
            if(!mpp.containsKey(s))
            mpp.put(s,1);
            else
            mpp.put(s,mpp.getOrDefault(s,0)+1);
        }
        for(String s:arr2) {
            if(!mpp.containsKey(s))
            mpp.put(s,1);
            else
            mpp.put(s,mpp.getOrDefault(s,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer>entry:mpp.entrySet()) {
            if(entry.getValue()==1)
            list.add(entry.getKey());
        }
        return list.toArray(new String[0]);
    }
}