class Solution {
    public int distanceTraveled(int a, int additionalTank) {
         if(a<5)return a*10;
        int s=0;
        while(a>=5){
     
            s+=5*10;
            a-=5;
            if(additionalTank>0){
                a++;
                additionalTank--;
            }
           
           
        }
        return s+(a*10);
    }
}