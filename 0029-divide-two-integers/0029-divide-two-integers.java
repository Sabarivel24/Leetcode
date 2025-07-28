class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        int r=0;

        while(a>=b){
            long t=b;
            int multiple=1;
            while(a>=(t<<1)){
                t<<=1;
                multiple<<=1;
            }
            a-=t;
            r+=multiple;
        }
        boolean isNeg=(dividend<0)^(divisor<0);
        return isNeg?-r:r;
        
    }
}