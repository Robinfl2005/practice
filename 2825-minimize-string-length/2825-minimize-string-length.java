class Solution {
    public int minimizedStringLength(String s) {
        char[]arr = s.toCharArray();
        Set<Character> st = new HashSet<>();
        for(char ch:arr) {
            st.add(ch);
        }
        return st.size();
    }
}