class Solution {
    public boolean isPossible(int[] time,long m,int tt){
        long trip=0;
        for(int t:time){
            trip+=m/t;
        }
        return trip>=tt;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long low=1;
        long high=1;
        for(int t:time){
            high=Math.max(high,(long)t*totalTrips);
        }
        while(low<high){
            long mid=(low+high)/2;
            if(isPossible(time,mid,totalTrips)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}