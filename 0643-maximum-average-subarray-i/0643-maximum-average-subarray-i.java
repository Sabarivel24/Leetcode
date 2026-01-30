class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,sum);
        }
        double avg=(double)maxSum/k;
        return avg;
    }
}