class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int s=0;
        if(num==0){
            return true;
        }
        return (num%10)!=0;
    }
}