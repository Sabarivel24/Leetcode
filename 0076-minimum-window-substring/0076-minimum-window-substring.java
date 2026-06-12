class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        {
            return "";
        }

        int remTarget = t.length(); //3
        int freq[] = new int[128]; //all ascii (since both uppercase and lowercase letters)
        for(char ch: t.toCharArray())
        {
            freq[ch]++; // [a - 1 b - 1 c - 1]
        }

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        int left=0;//ADOBECODEBANC
        for(int right=0; right<s.length(); right++)
        {
            char ch = s.charAt(right);// ADOBEC
            
            if(freq[ch]>0)
            {
                remTarget--; //3 -1 = 2 - 1 = 1 - 1 =0
            }
            freq[ch]--;  //A - 0  D - -1 B - 0  C = 0

            while(remTarget==0)  //0
            {
                if(right-left+1 < minLen) 
                {
                    minLen = right-left+1;
                    start = left; // START = 0;
                }

                freq[s.charAt(left)]++; //A - 1 D -0 
                if(freq[s.charAt(left)]>0) 
                {
                    remTarget++;
                }
                left++;
            }

        }
        return minLen==Integer.MAX_VALUE? "":s.substring(start,start+minLen);
    }
}