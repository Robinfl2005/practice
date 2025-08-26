class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int maxArea=0;
        double maxDia=0;
        for(int i=0;i<d.length;i++) {
            int l = d[i][0];
            int w = d[i][1];
            double Dia =Math.sqrt(l*l+w*w);
            int area = l*w;
            if(Dia>maxDia) {
                maxDia = Dia;
                maxArea = area;
            }
            else if(maxDia==Dia) {
                maxArea = Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}