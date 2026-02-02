class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int st=0;
        int en=0;
        while(st<s.length() && en<t.length()){
            if(s.charAt(st)==t.charAt(en)){
                st++;
            }
            en++;
        }
        
        return st==n;






















       /* int n=t.length();
        int[][] np=new int[n+1][26];
        for(int i=0;i<=n;i++){
            for(int c=0;c<26;c++){
                np[i][c]=-1;
            }
        }
        for(int c=0;c<26;c++){
            np[n][c]=-1;
        }
        for(int i=n-1;i>=0;i--){
            for(int c=0;c<26;c++){
                np[i][c]=np[i+1][c];
            }
            np[i][t.charAt(i)-'a']=i;
        }
        int pos=0;
        for(char ch:s.toCharArray()){
            if(pos>n)return false;
            pos=np[pos][ch-'a'];
            if(pos==-1)return false;
            pos++;
        }
        return true;*/
    }
}