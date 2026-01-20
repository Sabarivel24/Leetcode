class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(i==0||i==1){
                nums[k++]=nums[i];
                continue;
            }
            if(nums[k-2]!=nums[i]){
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}