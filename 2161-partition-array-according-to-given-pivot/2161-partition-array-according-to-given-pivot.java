class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
    int[] res=new int[nums.length];
    int l=0,r=nums.length-1,i,j;
    for(i=0,j=nums.length-1;i<nums.length;i++,j--){
        if(nums[i]<pivot){
            res[l]=nums[i];
            l++;
        }
        if(nums[j]>pivot){
            res[r]=nums[j];
            r--;
        }
    }
        while(l<=r){
            res[l]=pivot;
            l++;
        }
        return res;
    }
}