class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int n=ranks.length;

        String s1="Flush";
        String s2="Three of a Kind";
        String s3="Pair";
        String s4="High Card";

        Set<Character> set = new HashSet<>();

        for(char ch:suits)
        set.add(ch);

        if(set.size()==1)
        return s1;

        int freq[]=new int[26];
        for(int i=0;i<ranks.length;i++) {
           freq[ranks[i]]++;
        }
        int count=0;
        for(int i=0;i<freq.length;i++) {
            count=Math.max(count,freq[i]);
        }

        if(count==3||count==4)
        return s2;
        if(count==2)
        return s3;

        return s4;
    }
}