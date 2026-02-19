class Solution {
    public String countt(String a){
        int n=a.length();
        int count=1;
        String b="";
        char prev=a.charAt(0);
        for(int i=1;i<n;i++){
            if(prev!=a.charAt(i)){
                b+=count;
                b+=prev;
                count=0;
            }
            count++;
            prev=a.charAt(i);
        }
        b+=count;
        b+=prev;
        return b;
    }
    public String countAndSay(int n) {
        String ans="1";
        for(int i=2;i<=n;i++){
            ans=countt(ans);
        }
        return ans;
    }
}