class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int m=maxweight(weights);
        int s=sumweight(weights);
        int l=m;
        int h=s;
        while(l<=h){
            int mid=(l+h)/2;
            int nd=nodays(weights,mid);
            if(nd<=days){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public int nodays(int[] weights,int cap){
        int d=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if((load+weights[i])>cap){
                d=d+1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return d;
    }
    public int maxweight(int[] weights){
        int max=weights[0];
        for(int i=1;i<weights.length;i++){
            if(weights[i]>max){
                max=weights[i];
            }
        }
        return max;
    }
    public int sumweight(int[] weights){
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        return sum;
    }
}