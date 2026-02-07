class Solution {
    public int minimumDeletions(String s) {
        int bcount=0;
        int delete=0;
        for(char c:s.toCharArray()){
            if(c=='b'){
                bcount++;
            }
            else{
                delete=Math.min(delete+1,bcount);
            }
        }
        return delete;
    }
}