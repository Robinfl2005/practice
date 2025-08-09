class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        char[]arr=str.toCharArray();
        for(int i=0;i<arr.length;i++) {
            if(arr[i]=='6') {
                arr[i]='9';
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++) {
            sb.append(arr[i]);
        }
        return Integer.parseInt(sb.toString());
    }
}