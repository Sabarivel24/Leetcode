class Solution {
    public boolean canShip(int[] w,int cap,int days){
        int load=0;
        int d=1;
        for(int x:w){
            if(load+x>cap){
                d++;
                load=0;
            }
            load+=x;
        }
        return d<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int x:weights){
            low=Math.max(x,low);
            high+=x;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(canShip(weights,mid,days)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}