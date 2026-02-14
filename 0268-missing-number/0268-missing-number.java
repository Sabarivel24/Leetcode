class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=1;i<=n;i++){
            s+=i;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int a=s-sum;
        return a;
    }
}