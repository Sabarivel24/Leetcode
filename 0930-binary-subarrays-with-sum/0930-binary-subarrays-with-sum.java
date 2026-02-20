class Solution {
    public int count(int[] num,int goal){
        if(goal<0)return 0;
        int left=0;
        int count=0;
        int sum=0;
        for(int right=0;right<num.length;right++){
            sum+=num[right];
            while(sum>goal){
                sum-=num[left];
                left++;
            }
            count+=(right-left+1);
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return count(nums,goal)-count(nums,goal-1);
    }
}