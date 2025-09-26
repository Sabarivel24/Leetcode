class Solution {
    public int numSquares(int n) {
        if(n<=0)return 0;
        //Create an array dp to find least number
        int[] dp=new int[n+1];
        int i,j;
        int min;
        //Iterate over an number from 1 to n
        for(i=1;i<=n;i++){
            min=Integer.MAX_VALUE;
            for(j=1;j*j<=i;j++){
                int square=j*j;
                min=Math.min(min,dp[i-square]+1);
            }
            dp[i]=min;
        }
        return dp[n];
    }
}