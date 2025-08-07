class Solution {
    public String reverseStr(String s, int k) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            list.add(ch);
        }
        for(int i=0;i<s.length();i+=2*k) {
            int st=i;
            int end=Math.min(i+k-1,list.size()-1);
            reverseRange(list,st,end);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
    public void reverseRange(List<Character>list,int st,int end) {
        while(st<end) {
            char ch = list.get(st);
            char en = list.get(end);
            list.set(st,en);
            list.set(end,ch);
            st++;
            end--;
        }
    }
}