class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int newIndex=0;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int a=nums[i];
            if(a<0){
                newIndex=(i-Math.abs(a)%n+n)%n;
            }
            else{
                newIndex=(i+a)%n;
            }
            res[i]=nums[newIndex];
        }
        return res;
    }
}