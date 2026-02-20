class Solution {
    public int count(int[] a,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int l=0;
        int c=0;
        for(int r=0;r<a.length;r++){
            map.put(a[r],map.getOrDefault(a[r],0)+1);
            while(map.size()>k){
                map.put(a[l],map.get(a[l])-1);
                if(map.get(a[l])==0){
                    map.remove(a[l]);
                }
                l++;
            }
            c+=(r-l+1);
        }
        return c;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
}