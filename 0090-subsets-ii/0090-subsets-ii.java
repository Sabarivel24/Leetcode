class Solution {
    List<List<Integer>>ans;
    List<Integer>temp;
    public void func(int index,int[] a){
        //Base Condition
        if(index==a.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //Take
        temp.add(a[index]);
        func(index+1,a);

        //Backtrack
        temp.remove(temp.size()-1);

        //Skip Duplicates
        int i=index;
        while(i+1<a.length && a[i]==a[i+1]){
            i++;
        }

        //Not take
        func(i+1,a);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ans=new ArrayList<>();
        temp=new ArrayList<>();
        func(0,nums);
        return ans;
    }
}