class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int f=firstOccurence(nums,n,target);
        if(f==-1){
            return new int[]{-1,-1};
        }
        int l=lastOccurence(nums,n,target);
        return new int[]{f,l};
        
    }
    private int firstOccurence(int[] nums,int n,int k){
        int first=-1;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m]==k){
                first=m;
                h=m-1;
            }
            else if(nums[m]<k){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return first;
    }
    private int lastOccurence(int[] nums,int n,int k){
        int last=-1;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m]==k){
                last=m;
                l=m+1;
            }
            else if(nums[m]<k){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return last;
    }
}