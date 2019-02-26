public class TotalPossiblePathsMatrix {
    public int calPossiblePaths(boolean[][] matrix){
        int row = matrix.length,col = matrix[0].length;
        int pathExist[][] = new int[row][col];
        int paths = totalPathRec(matrix,0,0,pathExist);
        return paths;
    }

    private int totalPathRec(boolean[][] matrix, int row, int col,int pathExists[][]) {
        if (!isValidPath(matrix,row,col)){
            return 0;
        }
        if(row == matrix.length-1 && col == matrix[0].length-1){
            return 1;
        }
        else if(pathExists[row][col] == 0){
            pathExists[row][col] = totalPathRec(matrix,row+1,col,pathExists) + totalPathRec(matrix,row,col+1,pathExists);
        }
        return pathExists[row][col];
    }
    private boolean isValidPath(boolean matrix[][], int row, int col){
        if(row>=matrix.length || col >= matrix[0].length){
            return false;
        }
        else if(matrix[row][col] == false){
            return false;
        }
        else{
            return true;
        }
    }
}
