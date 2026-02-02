class Solution {
    public String longestPalindrome(String s) {
      int n=s.length();
      if(n==0)return"";

      int st=0,e=0;
      for(int i=0;i<n;i++){
        int len1=expand(s,i,i);
        int len2=expand(s,i,i+1);
        int len=Math.max(len1,len2);
        if(len>e-st){
            st=i-(len-1)/2;
            e=i+len/2;
        }
      }
      return s.substring(st,e+1);
    }
    private int expand(String s,int one,int two){
        while(one>=0 && two<s.length() && s.charAt(one)==s.charAt(two)){
            one--;
            two++;
        }
        return two-one-1;
    }
}