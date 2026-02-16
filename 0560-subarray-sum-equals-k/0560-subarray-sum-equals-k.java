class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
       map.put(0,1);
       int sum=0;
       int count=0;
       for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
       }
       return count;
       
       
       
       
       /* int n=nums.length;
        int count=0;
        int i=0;
        int j=0;
        int s=0;
        while(j<n){
            int Sum=sumnumbers(i,j);
            if(Sum==k){
                count++;
            }
            else if(Sum<k){
                j++;
            }
            else if(Sum>k){
                i++;
            }
        }
        return count;
         private static int sumnumbers(int i,int j){
            for(int l=i;l<j;l++){
                s+=nums[l];
            }
            return s;
        }*/
    }
}