public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int reshapeMatrix[][] = new int[r][c],n = nums.length,m = nums[0].length,rowCount = 0,colCount = 0;
        if(m*n != r*c)return nums;
        for(int i = 0; i<n;++i){
            for(int j = 0;j<m;++j){
                reshapeMatrix[rowCount][colCount] = nums[i][j];
                colCount++;
                if(colCount == c){
                    colCount = 0;
                    rowCount++;
                }
            }
        }
        return reshapeMatrix;
    }
}
