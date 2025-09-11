class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2)return true;
        long l=2,r=num/2;
        while(l<=r){
        long m=l+(r-l)/2;
        long square=m*m;
        if(square==num){
            return true;
        }
        else if(square<num){
            l=m+1;
        }
        else{
            r=m-1;
        }
        }
        return false;
    }
}