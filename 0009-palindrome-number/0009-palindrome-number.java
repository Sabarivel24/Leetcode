class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0){
            int s=0;
            int t=x;
            while(x!=0){
                int a=x%10;
                s=(s*10)+a;
                x/=10;
            }
            if(s==t){
                return true;
            }
        }
        return false;
    }
}