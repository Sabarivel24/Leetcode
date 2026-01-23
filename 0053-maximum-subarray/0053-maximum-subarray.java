class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int s=0;
        for(int n:nums){
            s+=n;
            if(s>maxsum){
                maxsum=s;
            }
            if(s<0){
                s=0;
            }
        }
        return maxsum;
    }
}