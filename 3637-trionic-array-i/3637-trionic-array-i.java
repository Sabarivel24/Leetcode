class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<4)return false;
        int i=1;
        while(i<n && nums[i]>nums[i-1]){
            i++;
        }
        if(i==1||i==n)return false;
        while(i<n && nums[i]<nums[i-1]){
            i++;
        }
        if(i==n)return false;
        while(i<n && nums[i]>nums[i-1]){
            i++;
        }
        
        return i==n;
    }
}




/*

9>8 yes 
p=1

4<9
q=1

6>4
r=1

*/