public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length,m = matrix[0].length,i = n - 1,j = 0,incrementor = 0,elementCheck;
        while(j < m){
            elementCheck = matrix[i][j];
            incrementor = 0;
            while (i+incrementor< n && j + incrementor < m){
                if(elementCheck != matrix[i+incrementor][j+incrementor]){
                    return false;
                }
                incrementor++;
            }
            if(i == 0){
                j++;
            }
            else{
                i--;
            }
        }
        return true;
    }
}
