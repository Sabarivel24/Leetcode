class Solution {
    public static boolean check(String s1,String s2){
        if(s2.length()!=s1.length()+1){
            return false;
        }
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i==s1.length();
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int ans=1;
        int n=words.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(check(words[j],words[i]) && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}