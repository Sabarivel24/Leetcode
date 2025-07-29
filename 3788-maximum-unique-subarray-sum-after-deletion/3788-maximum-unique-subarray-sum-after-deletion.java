class Solution {
    public int maxSum(int[] nums) {
        Set <Integer> seen=new HashSet<>();
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int num:nums){
            ms=Math.max(ms,num);
            if(num>=0){
                if(!seen.contains(num)){
                    cs+=num;
                }
                seen.add(num);
            }
        }
        if(ms<0){
            return ms;
        }
        return cs;
    }
}