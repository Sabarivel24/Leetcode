class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[] dp=new int[n];
        int i,row,col;
        //For taking values of last row - [4 ,1 , 8, 3]
        for(i=0;i<n;i++){
            dp[i]=triangle.get(n-1).get(i);
        }
        //For iterating from lastbefore row to top row
        for(row=n-2;row>=0;row--){
            for(col=0;col<=row;col++){
                dp[col]=triangle.get(row).get(col)+Math.min(dp[col],dp[col+1]);
            }
        }
        return dp[0];
    }
}