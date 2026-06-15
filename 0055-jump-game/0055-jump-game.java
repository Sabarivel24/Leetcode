class Solution {
    public boolean canJump(int[] nums) {
        int f=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]+i>=f){
                f=i;
            }
            else{
                continue;
            }
        }
        if(f==0){
            return true;
        }
        return false;
    }
}