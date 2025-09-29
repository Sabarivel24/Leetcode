class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int i;
        int n=nums.length;
        for(i=1;i<=n;i++){
            if(n%i==0){
                sum+=nums[i-1]*nums[i-1];
            }
        }
        return sum;
        
    }
}