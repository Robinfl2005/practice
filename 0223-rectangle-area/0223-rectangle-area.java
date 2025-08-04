class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2-ax1)*(ay2-ay1);
        int area2 = (bx2-bx1)*(by2-by1);

        int c1 = Math.max(ax1,bx1);
        int c2 = Math.max(ay1,by1);
        int c3 = Math.min(ax2,bx2);
        int c4 = Math.min(ay2,by2);

        int overLap = Math.max(0,c3-c1)*Math.max(0,c4-c2);

        int area = (area1+area2)-overLap;

        return area;
    }
}