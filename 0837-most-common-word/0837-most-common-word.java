class Solution {
    public String mostCommonWord(String para, String[] banned) {
        para=para.toLowerCase().replaceAll("[^a-z]"," ");
        String[] arr = para.split("\\s+");
        Map<String,Integer> mpp = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(String s:banned)
        set.add(s);
        for(String s:arr) {
            boolean b = true;
            if(set.contains(s)) {
                b = false;
               continue;
            }
            if(b==true)
            mpp.put(s,mpp.getOrDefault(s,0)+1);
        }
        String s = " ";
        int maxCount=0;
        for(Map.Entry<String,Integer>entry:mpp.entrySet()) {
            if(entry.getValue()>maxCount) {
                s = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return s;
    }
}