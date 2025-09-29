class Solution {
    public int[] numberGame(int[] nums) {
        
        int i,j,temp;
        int[] removed = new int[nums.length]; // new array to store removed elements
        int count = 0;

        while (nums.length > 0) {
            // remove first element
            int element = Arrays.stream(nums).min().getAsInt();

            // store into removed array
            removed[count++] = element;

            // create new array with size-1
            int[] arr = new int[nums.length-1];
             boolean skipped = false;
            for (i = 0, j = 0; i < nums.length; i++) {
                if (!skipped && nums[i] == element) {
                    skipped = true; // skip only the first occurrence
                } else {
                    arr[j++] = nums[i];
                }
            }

            nums = arr; // update original array
        }
        for(i=0;i<removed.length;i+=2){
            temp=removed[i];
            removed[i]=removed[i+1];
            removed[i+1]=temp;
        }
        return removed;
    }
}