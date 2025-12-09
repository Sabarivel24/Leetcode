class Solution {
    private static final int mod = 1_000_000_007;
    private static final int maxv=100_000;
     private static final int LIMIT = 2 * maxv;
    public int specialTriplets(int[] nums) {
        int n=nums.length;
       /* int maxv=0;
        for(int v:nums){
            if(v>maxv){
                maxv=v;
            }
        }
        int LIMIT=maxv*2;*/
        long[] left=new long[LIMIT+1];
        long[] right=new long[LIMIT+1];
        for(int v:nums){
            right[v]++;
        }
        long ans=0;
        for(int j=0;j<n;j++){
            int x=nums[j];
            right[x]--;
            int target=x*2;
            if(target<=LIMIT){
                long leftcnt=left[target];
                long rightcnt=right[target];
                long add=(leftcnt*rightcnt)%mod;
                ans=(ans+add)%mod;
            }
            left[x]++;
        }
        return (int)ans;
    }
}