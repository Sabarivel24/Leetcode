class Solution {
    public int majorityElement(int[] nums) {
       int count=0;
       int candi=0;
       for(int num:nums){
        if(count==0){
            candi=num;
        }
        count+=(candi==num)?1:-1;
       }
    return candi;
    }
}