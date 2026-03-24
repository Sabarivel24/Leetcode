class Solution {
     public int gcd(int a,int b){
        if(b==0)return a;
        else return gcd(b,a%b);
    }
     public int gcdOfOddEvenSums(int n) {
        int sO=0;
        int sE=0;
       for(int i=1;i<=2*n;i++){
                if(i%2!=0)sO+=i;
                else sE+=i;
       }
       
       return gcd(sO,sE);
    
        
    }
}