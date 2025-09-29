class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int answer1=0;
        int answer2=0;
        int i,j;
        for(i=0;i<nums2.length;i++){
            for(j=0;j<nums1.length;j++){
                if(nums1[j]==nums2[i]){
                    answer1++;
                    break;
                }
            }
        }
        for(i=0;i<nums1.length;i++){
            for(j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    answer2++;
                    break;
                }
            }
        }
        return new int[]{answer2,answer1};
        
    }
}