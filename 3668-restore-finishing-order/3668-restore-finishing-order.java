class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer>res=new HashSet<>();
        for(int f:friends){
            res.add(f);
        }
        List<Integer> sol=new ArrayList<>();
        for(int o:order)
        {
            if(res.contains(o))
                sol.add(o);
        }
        return sol.stream().mapToInt(Integer::intValue).toArray();
    }
}