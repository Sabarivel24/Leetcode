class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0;
        int r=1;
        int count=0;
        while(r<n){
            if(l==r){
                r++;
                continue;
            }
            int diff=nums[r]-nums[l];
            if(diff==k){
                 int cnt1 = 1, cnt2 = 1;
                int x = nums[l];
                int y = nums[r];

                l++;
                r++;

                while(l < n && nums[l] == x){
                    cnt1++;
                    l++;
                }

                while(r < n && nums[r] == y){
                    cnt2++;
                    r++;
                }

                count += cnt1 * cnt2;
            }
            else if(diff<k){
                r++;
            }
            else{
                l++;
            }
        }
        return count;
    }
}