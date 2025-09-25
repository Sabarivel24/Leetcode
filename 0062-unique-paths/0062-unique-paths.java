class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid= new int[m][n];
        int i,j;
        //MAke first row as filled with "1"
        for(i=0;i<m;i++){
                grid[i][0]=1;
         }
         //Make first column as filled with "1"
         for(j=0;j<n;j++){
            grid[0][j]=1;
         }
         /*Make remaining cells filled with value , from that we find unique path that is last element value grid[m-1][n-1]*/
         for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                grid[i][j]=grid[i-1][j]+grid[i][j-1];
            }
         }
         return grid[m-1][n-1];
    }
}