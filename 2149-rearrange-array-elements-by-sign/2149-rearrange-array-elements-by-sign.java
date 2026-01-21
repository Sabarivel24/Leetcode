class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> nos=new ArrayList<>();
        for(int a:nums){
            if(a>0){
                pos.add(a);
            }
            else{
                nos.add(a);
            }
        }
        int i=0;
        int p=0;
        int n=0;
        while(p<pos.size() && n<nos.size()){
            nums[i++]=pos.get(p++);
            nums[i++]=nos.get(n++);
        }
        while(p<pos.size()){
            nums[i++]=pos.get(p++);
        }
        while(n<nos.size()){
            nums[i++]=nos.get(n++);
        }
        return nums;
    }
}