import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralList = new ArrayList<>();
        int m = matrix.length;
        if(m == 0 || matrix == null) return spiralList;
        int n = matrix[0].length;
        if(n == 0)return spiralList;
        for(int i = 0;i <= m/2;i++){
            int j = i, k = i;
            while(j < m-i){
                if(k < n-i-1){
                    spiralList.add(matrix[j][k]);
                    k++;
                }
                else {
                    spiralList.add(matrix[j][k]);
                    j++;
                }
            }
            k -= 1;
            j--;
            while(j>i+1){
                if(k >= i){
                    spiralList.add(matrix[j][k]);
                    k--;
                }
                else{
                    spiralList.add(matrix[j-1][k+1]);
                    j--;
                }
            }
        }
        return spiralList;
    }
}
