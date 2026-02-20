class Solution {
    public static boolean isPossible(int[] a,int h,int m){
        long total=0;
        for(int x:a){
            total+=(x+m-1)/m;
        }
        return total<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
       int low=1;
       int high=0;
       for(int x:piles)
       {
        high=Math.max(high,x);
       }
       while(low<high){
        int mid=(low+high)/2;
        if(isPossible(piles,h,mid)){
            high=mid;
        }
        else{
            low=mid+1;
        }
       }
       return low;
    }
}