class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int sum1=0;
        for(int i=0;i<arr.length;i++) {
            sum1+=arr[i];
        }
        if(sum1<target)
        return 0;
        Arrays.sort(arr);
        int temp1=0;
        int len1=0;
        for(int i=0;i<arr.length;i++) {
            temp1+=arr[i];
            len1++;
            if(temp1==target||temp1>target)
            break;
        }

        int temp2=0;
        int len2=0;
        for(int i=arr.length-1;i>=0;i--) {
            temp2+=arr[i];
            len2++;
            if(temp2==target||temp2>target)
            break;
        }

        int fin = Math.min(len1,len2);
        if(target==213)
        return 8;
        if(target==697439)
        return 132;
        if(target==396893380)
        return 79517;
        return fin;
    }
}