class Solution {
    public String reverseVowels(String s) {
        char[] chararray=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right){
            while(left<right && !isVowel(chararray[left]))left++;
            while(left<right && !isVowel(chararray[right]))right--;
            if(left<right){
                char temp=chararray[left];
                chararray[left]=chararray[right];
                chararray[right]=temp;
                left++;
                right--;
            }
        }
        return new String(chararray);
    }
        private boolean isVowel(char c){
            return "aeiouAEIOU".indexOf(c)>=0;
        }
        
    
}