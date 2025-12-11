class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
         int[] minY = new int[n+1];
        int[] maxY = new int[n+1];
        int[] minX = new int[n+1];
        int[] maxX = new int[n+1];

        Arrays.fill(minY, Integer.MAX_VALUE);
        Arrays.fill(minX, Integer.MAX_VALUE);
        Arrays.fill(maxY, Integer.MIN_VALUE);
        Arrays.fill(maxX, Integer.MIN_VALUE);

        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            if (y < minY[x]) minY[x] = y;
            if (y > maxY[x]) maxY[x] = y;
            if (x < minX[y]) minX[y] = x;
            if (x > maxX[y]) maxX[y] = x;
        }
        int ans=0;
        for(int[] b:buildings){
            int x=b[0],y=b[1];
            boolean hasleft=minY[x]<y;
            boolean hasright=maxY[x]>y;
            boolean hasabove=minX[y]<x;
            boolean hasbelow=maxX[y]>x;
            if(hasleft && hasright && hasabove && hasbelow)ans++;
        }
        return ans;
    }
}