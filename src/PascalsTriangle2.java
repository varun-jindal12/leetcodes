import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i<=rowIndex;++i){
            List<Integer> currentRow = new ArrayList<>();
            for(int j = 0; j<=i;++j){
                if(j == 0 || j == i){
                    currentRow.add(1);
                }
                else{
                    currentRow.add(row.get(j-1)+row.get(j));
                }
            }
            row = currentRow;
        }
        return row;
    }
}
