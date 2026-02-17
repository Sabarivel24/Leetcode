class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tcost=0;
        int tgas=0;
        int start=0;
        int tank=0;
        for(int i=0;i<gas.length;i++){
            tcost+=cost[i];
            tgas+=gas[i];
            tank+=gas[i]-cost[i];
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        return (tgas>=tcost)?start:-1;
    }
}