class Solution {
    public int findClosest(int x, int y, int z) {
        int p1=Math.abs(z-x);
        int p2=Math.abs(z-y);
        int ans=0;
        if(p1==p2) {
        ans=0;
        //return 0;
        }
        else if(p1<p2) {
            ans=1;
            //return 1;
        }
        else
        ans=2;
        //return 2;
        return ans;
    }
}