class Solution {
    public boolean isPossible(int[] bloomDay,int mid,int m,int k){
        int count=0;
        int bou=0;
        for(int x:bloomDay){
            if(x<=mid){
                count++;
                if(count==k){
                    bou++;
                    count=0;
                }
            }
            else{
                count=0;
            }
        }
        return bou>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)return -1;
        int low=0;
        int high=0;
        for(int x:bloomDay){
            low=Math.min(low,x);
            high=Math.max(high,x);
        }
        while(low<high){
            int mid=(low+high)/2;
            if(isPossible(bloomDay,mid,m,k)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}