class Solution {
    public int count(int[] num,int k){
        int left=0;
        int count=0;
        int odd=0;
        for(int right=0;right<num.length;right++){
            if(num[right]%2!=0){
                odd++;
            }
            while(odd>k){
                if(num[left]%2==1){
                    odd--;
                }
                left++;
            }
            count+=(right-left+1);

        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
       return count(nums,k)-count(nums,k-1);
    }
}