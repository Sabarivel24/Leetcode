class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int minTarget=Integer.MAX_VALUE;
        int b=(int)target;
        for(int i=0;i<letters.length;i++){
            int a=(int)letters[i];
            if(a>b){
                minTarget=Math.min(minTarget,a);
            }
        }
        if(minTarget==Integer.MAX_VALUE){
            return letters[0];
        }
        char res=(char)minTarget;
        return res;
    }
}