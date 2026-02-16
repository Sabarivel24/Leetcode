class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int longest=0;
        for(int a:nums){
            set.add(a);
        }
        for(int a:set){
            if(!set.contains(a-1)){
                int num=a;
                int count=1;
                while(set.contains(num+1)){
                    num++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}