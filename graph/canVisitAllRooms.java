package graph;
import java.util.ArrayList;
import java.util.List;
//question 841
public class canVisitAllRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visted = new boolean[rooms.size()];
        for(int i = 0; i < visted.length; i++)  visted[i] = false;
        dfs(rooms,0,visted);
        for(int i = 0; i < visted.length; i++){
            if(!visted[i]){
                return false;
            }
        }
        return true;
    }
    public static void dfs(List<List<Integer>> rooms,int roomNum,boolean[] visted){
        visted[roomNum] = true;
        for(int v = 0; v < rooms.get(roomNum).size(); v++){
            if(!visted[rooms.get(roomNum).get(v)]){
                dfs(rooms,rooms.get(roomNum).get(v),visted);
            }
        }
    }
}
