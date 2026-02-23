class Solution {
    public static boolean isDivisible(int[] a,int m,int k){
        int sum=0;
        for(int x:a){
            sum+=(x+m-1)/m;
        }
        return sum<=k;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int x:nums){
            high=Math.max(high,x);
        }
        while(low<high){
            int mid=(low+high)/2;
            if(isDivisible(nums,mid,threshold)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
}