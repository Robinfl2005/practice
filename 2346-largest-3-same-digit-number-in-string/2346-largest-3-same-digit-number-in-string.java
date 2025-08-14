class Solution {
    public String largestGoodInteger(String num) {
         char[]arr=num.toCharArray();
         StringBuilder sb = new StringBuilder("-1");
         int a=0;
        for(int i=0;i<arr.length-2;i++) {
            String s = sb.toString();
             if(arr[i]==arr[i+1]&&arr[i]==arr[i+2]&&arr[i]>(int)(s.charAt(0)))
             {a=a+1;
              sb.delete(0,1);
              sb.insert(0,arr[i]);
             }
        }
         int num1=3;
         String res=String.valueOf(sb.toString()).repeat(num1);
        /*int st=0;
        int end=1;
        StringBuilder sb = new StringBuilder();
        String n = sb.toString();
        System.out.print(n);
        while(st<s.length()&&end<s.length()) {
            if(s.charAt(st)==s.charAt(end)) {

                end++;
            }
            else {
                st++;
                end++;(
            }
        }*/
        String fin = "";
        for(int i=0;i<res.length();i++) {
            if(i%2==0) {
                fin+=res.charAt(i);
            }
        }
        if(fin.equals("---"))
        return "";
        return fin;
    }
}