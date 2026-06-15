class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        int boat=0;
        int l=0;
        int r=n-1;
        while(l<=r){
            if(people[l]+people[r]>limit){
                boat++;
                r--;
            }
            else{
                boat++;
                l++;
                r--;
            }
        }
        return boat;
    }
}