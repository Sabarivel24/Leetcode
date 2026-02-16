class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       
       int n=nums.length;
       int[] res=new int[n-k+1];
       Deque<Integer>dq=new LinkedList<>();
       int idx=0;
       for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst()==i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                res[idx++]=nums[dq.peekFirst()];
            }
       }
       return res;
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       /* ArrayList<Integer> res=new ArrayList<>();
        int maxSlide=Integer.MIN_VALUE;
        int m=Integer.MAX_VALUE;
        int[] freq=new int[m+1];
        for(int i=0;i<k;i++){
            freq[nums[i]]++;
            maxSlide=Math.max(maxSlide,nums[i]);
        }
        res.add(maxSlide);
        for(int i=k;i<nums.length;i++){
            freq[nums[i-k]]--;
            freq[nums[i]]++;
            maxSlide=Math.max(maxSlide,nums[i]);
            res.add(maxSlide);
        }
        int[] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;*/
    }
}