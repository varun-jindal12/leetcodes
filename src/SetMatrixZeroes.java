import java.util.List;

public class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] matrix){
        if(matrix.length == 0 && matrix[0].length == 0)return;
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;++j){

                if(matrix[i][j] == 0 && visited[i][j] == false){
                    makeZero(matrix,i,j,visited);
                }
            }
        }
    }
    void makeZero(int[][]matrix,int i,int j,boolean[][] visited){
        for(int k = 0;k<matrix.length;k++){
            if(matrix[k][j] != 0){
                visited[k][j] = true;
            }
            matrix[k][j] = 0;
        }
        for(int l = 0;l<matrix[0].length;l++){
            if(matrix[i][l] != 0){
                visited[i][l] = true;
            }
            matrix[i][l] = 0;
        }
    }
}
