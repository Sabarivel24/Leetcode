class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res=new ArrayList<>();
        int k=p.length();
        int[] freq=new int[26];
        int[] resfreq=new int[26];
        if(s.length()<p.length()){
            return res;
        }
        for(int i=0;i<k;i++){
            freq[p.charAt(i)-'a']++;
            resfreq[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,resfreq)){
            res.add(0);
        }
        for(int i=k;i<s.length();i++){
            resfreq[s.charAt(i-k)-'a']--;
            resfreq[s.charAt(i)-'a']++;
            if(Arrays.equals(freq,resfreq)){
                res.add(i-k+1);
            }
        }
        return res;
    }
}