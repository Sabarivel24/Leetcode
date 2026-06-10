class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min=nums[0];
        long max=nums[0];
        long tv=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<k;i++){
            tv+=(max-min);
        }
        return tv;
    }
}