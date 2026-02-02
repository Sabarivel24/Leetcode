class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return"";
        String small=strs[0];
        for(String s:strs){
            if(s.length()<small.length()){
                small=s;
            }
        }
        for(String s:strs){
            int i=0;
            while(i<small.length() &&  s.charAt(i)==small.charAt(i)){
                i++;
            }
            small=small.substring(0,i);
        }
        return small;
    }
}