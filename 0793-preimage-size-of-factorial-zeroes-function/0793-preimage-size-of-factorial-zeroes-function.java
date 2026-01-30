class Solution {
    public int preimageSizeFZF(int k) {
        long start=0;
        long end=5L*(k+1);
        while(start<=end){
        long mid=start+(end-start)/2;
        long zeros=trailing(mid);

        if(zeros==k)return 5;
        if(zeros<k){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        }
        return 0;
    }
    private int trailing(long n){
        long count=0;
        while(n>0){
            n/=5;
            count+=n;
        }
        return (int)count;
    }
}