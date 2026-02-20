class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int max=0;
        int maxF=0;
        int[] freq=new int[26];
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxF=Math.max(maxF,freq[s.charAt(right)-'A']);
            while(((right-left+1)-maxF)>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}