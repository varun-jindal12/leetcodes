import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BfsInGraph {

    class BeautyNode{
        public int citi;
        public int time;
        public int currentBeauty;
        public boolean[] visited;
        BeautyNode(int citi,int time, int currentBeauty, boolean[] visited){
            this.citi = citi;
            this.time = time;
            this.currentBeauty = currentBeauty;
            this.visited = visited;
        }
    }
    // prints BFS traversal from a given source s
    public int BFS(int n, int m, int max_T, int[] beauty, int[] u, int[] v, int[] t)
    {
        boolean visited[] = new boolean[n];
        LinkedList<BeautyNode> queue = new LinkedList<>();
        visited[0]=true;
        BeautyNode beautyNode = new BeautyNode(0, 0, beauty[0], visited);
        queue.add(beautyNode);
        int[][] matrix = makeMatrix(n,u,v,t);
        int maxBeauty = beauty[0];

        while (queue.size() != 0)
        {
            BeautyNode beautyNode1 = queue.poll();
            int node = beautyNode1.citi;
            int time = beautyNode1.time;
            int currentBeauty = beautyNode1.currentBeauty;
            boolean[] currentVisited = beautyNode1.visited;
            for(int i = 0; i<matrix[node].length;i++){
                if(matrix[node][i] != -1){
                    int calculatedBeauty = currentBeauty;
                    if (time + matrix[node][i] <= max_T)
                    {
                        if(!currentVisited[i]){
                            calculatedBeauty += beauty[i];
                        }
                        maxBeauty = Math.max(maxBeauty, calculatedBeauty);
                        boolean[] newVisited = Arrays.copyOf(currentVisited, currentVisited.length);
                        newVisited[i] = true;
                        BeautyNode beautyNode2 = new BeautyNode(i, time + matrix[node][i], calculatedBeauty, newVisited);
                        queue.add(beautyNode2);
                    }
                }
            }
        }
        return maxBeauty;
    }

    public int[][] makeMatrix (int n, int []u, int[] v, int []t){
        int[][] resultMatrix = new int[n][n];
        for(int[] array: resultMatrix){
            Arrays.fill(array, -1);
        }
        for(int i = 0;i<u.length;i++){
            resultMatrix[u[i]][v[i]] = t[i];
            resultMatrix[v[i]][u[i]] = t[i];
        }
        return resultMatrix;
    }

}
