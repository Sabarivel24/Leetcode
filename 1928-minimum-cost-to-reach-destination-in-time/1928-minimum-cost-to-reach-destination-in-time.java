//dijsktra
class Solution {
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        int n=passingFees.length;
        List<int[]>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            int time=e[2];
            graph[u].add(new int[]{v,time});
            graph[v].add(new int[]{u,time});
        }
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        dist[0]=0;
        pq.offer(new int[]{passingFees[0],0,0});
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int cost=cur[0];
            int ti=cur[1];
            int node=cur[2];

            if(node==n-1)return cost;

            for(int[] nei:graph[node]){
                int next=nei[0];
                int t=nei[1];

                int nt=ti+t;
                int nc=cost+passingFees[next];

                if(nt>maxTime)continue;

                if(nt<dist[next]){
                    dist[next]=nt;
                    pq.offer(new int[]{nc,nt,next});
                }
            }
        }
        return -1;
    }
}