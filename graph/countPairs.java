package graph;

import java.util.HashMap;

public class countPairs {
    public static long countPairs(int n, int[][] edges) {
        Boolean[] visted = new Boolean[n];
        for(int i = 0; i < n; i++) visted[i] = false; 
        int[] componentsId = new int[n];
        for(int i = 0; i < n; i++) componentsId[i] = i; 
        for(int compId = 0; compId < n; compId++){
            if(!visted[compId]){
                dfs(edges,visted,componentsId,compId,compId);
            }
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++){
            map.putIfAbsent(componentsId[i],0);
            map.put(componentsId[i],map.get(componentsId[i] + 1));
        }
        long unReachPairs = 0;
        int sum;
        for(int id1:map.keySet()){
            sum = 0;
            for(int id2:map.keySet()){
                if(id1 != id2){
                    sum += map.get(id2);
                }
            }
            unReachPairs += sum*map.get(id1);
            map.put(id1,0);
        }
        return unReachPairs;
    }
    public static void dfs(int[][] edges,Boolean[] visted,int[] componentsId,int compId,int vertex){
        for(int v = 0; v < edges.length; v++){
            if(edges[v][0] == vertex){
                if(!visted[edges[v][1]]){
                    componentsId[edges[v][1]] = compId;
                    visted[edges[v][1]] = true;
                    dfs(edges,visted,componentsId,compId,edges[v][1]); 
                } 
            }
        }
    }
}
