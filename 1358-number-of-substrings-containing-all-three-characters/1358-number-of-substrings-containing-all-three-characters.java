class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.containsKey('a')&& map.containsKey('b')&& map.containsKey('c')){
                count+=(s.length())-right;
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
        }
        return count;
    }
}