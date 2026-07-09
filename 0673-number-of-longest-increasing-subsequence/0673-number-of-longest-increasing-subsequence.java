class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int[] prev=new int[n];
        int maxi=1;
        Arrays.fill(dp,1);
        Arrays.fill(prev,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(dp[i]<dp[j]+1){
                        dp[i]=dp[j]+1;
                        prev[i]=prev[j];
                    }
                    else if(dp[i]==dp[j]+1){
                        prev[i]+=prev[j];
                    }
                }
            }
            maxi=Math.max(maxi,dp[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(dp[i]==maxi){
                ans+=prev[i];
            }
        }
        return ans;
    }
}