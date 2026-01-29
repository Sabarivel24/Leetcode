class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=0;
        int b=0;
        for(int i=1;i<n*2;i=i+2){
            a+=i;
            b=b+i+1;
        }
        return gcd(a,b);
    }
    private static int gcd(int a,int b){
        if(b==0)return a;
        else{
            return gcd(b,a%b);
        }
    }
}