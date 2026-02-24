class Solution {
    List<List<Integer>>ans;
    List<Integer>temp;
    public void func(int index,int[] a){
        if(index==a.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        //Take
        temp.add(a[index]);
        func(index+1,a);
        //backtrack
        temp.remove(temp.size()-1);
        //Not take
        func(index+1,a);

    }

    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        temp=new ArrayList<>();
        func(0,nums);
        return ans;
    }
}