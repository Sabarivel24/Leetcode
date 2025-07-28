class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),0,result);
        return result;
    }
    public void backtrack(int[] candidates,int target,int start,List<Integer> cur,int total,List<List<Integer>> result){
        if(total==target){
            result.add(new ArrayList<>(cur));
            return;
        }
         if (total > target || start >= candidates.length) {
            return;
        }
            cur.add(candidates[start]);
            backtrack(candidates,target,start,cur,total+candidates[start],result);
            cur.remove(cur.size()-1);
            backtrack(candidates, target, start + 1, cur, total, result);
    }
}