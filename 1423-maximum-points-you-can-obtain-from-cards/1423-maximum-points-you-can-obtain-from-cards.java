class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int last=cardPoints.length-1;
        int s=0;
        for(int i=0;i<k;i++){
            s+=cardPoints[i];
        }
        int max=0;
        max=s;
        for(int i=k-1;i>=0;i--){
            s-=cardPoints[i];
            s+=cardPoints[last];
            last--;
            max=Math.max(max,s);
        }
        return max;
    }
}