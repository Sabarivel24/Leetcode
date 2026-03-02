class Solution {
    public String convert(String s, int n) {
        if(n==1)return s;
        StringBuilder a=new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=i;j<s.length();j+=(2*(n-1))){
                a.append(s.charAt(j));
                if(i>0 && i<n-1 && j+(2*(n-1))-(2*i)<s.length()){
                    a.append(s.charAt(j+(2*(n-1))-(2*i)));
                }
            }
        }
        return a.toString();
    }
}