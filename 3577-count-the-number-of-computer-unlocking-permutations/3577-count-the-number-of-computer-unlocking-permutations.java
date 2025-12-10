class Solution {
    private static final int mod=1_000_000_007;
    public int countPermutations(int[] complexity) {
        int n=complexity.length;
        int root=complexity[0];
        for(int i=1;i<n;i++){
            if(complexity[i]<=root){
                return 0;
            }
        }
        long ans=1;
        for(int k=1;k<n;k++){
            ans=(ans*k)%mod;
        }
        return (int)ans;
    }
}