class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int i,j;
        if (obstacleGrid[0][0] == 1) return 0;
        obstacleGrid[0][0]=1;
        //Make First row as filled with '1s'
        for(i=1;i<m;i++){
            if(obstacleGrid[i][0]==0 && obstacleGrid[i-1][0]==1){
            obstacleGrid[i][0]=1;
            }
            else{
                obstacleGrid[i][0]=0;
            }
        }
        //Make First Column are filled with '1s'
        for(j=1;j<n;j++){
            if(obstacleGrid[0][j]==0 && obstacleGrid[0][j-1]==1){
            obstacleGrid[0][j]=1;
            }
            else{
                obstacleGrid[0][j]=0;
            }
        }
        for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=0;
                }
                else{
                    obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                }
            }
        }
        return obstacleGrid[m-1][n-1];
    }
}