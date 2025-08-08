class Solution {
    double memo[][]=new double[200][200];
    public double soupServings(int n) {
        if(n>4800)
        return 1.0;

        int result = (n+24)/25;
        return serve(result,result);
    }
    public double serve(int a, int b) {
        if(a <= 0 && b <= 0) return 0.5;
        if(b <= 0) return 0.0;
        if(a <= 0) return 1.0;

        if(memo[a][b]>0)
        return memo[a][b];

        double prob = 0.25*(serve(a-4,b)+
                            serve(a-3,b-1)+
                            serve(a-2,b-2)+
                            serve(a-1,b-3));
        memo[a][b]=prob;
        return memo[a][b];
    }
}