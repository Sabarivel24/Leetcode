class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        int l=0,cs=0,ms=0;
        for(int r=0;r<nums.length;r++){
            while(seen.contains(nums[r])){
                seen.remove(nums[l]);
                cs-=nums[l];
                l++;
            }
            seen.add(nums[r]);
            cs+=nums[r];
            ms=Math.max(ms,cs);
        }
        return ms;
    }
}