import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        /*List<List<Integer>> pascalsTriangle = new ArrayList<List<Integer>>();
        int num;
        for(int i = 0 ;i<numRows;++i){
            List<Integer> newList = new ArrayList<Integer>();
            num = (int)Math.pow(11,i);
            while(num>0){
                newList.add(num%10);
                num /= 10;
            }
            pascalsTriangle.add(newList);
        }*/
        List<List<Integer>> pascalsTriangle = new ArrayList<List<Integer>>();
        List<Integer> newList;
        for(int i = 0 ;i < numRows;++i){
            newList = new ArrayList<Integer>();
            for(int j = 0 ;j<=i;++j){
                if(j == 0 || j == i){
                    newList.add(Integer.valueOf(1));
                }
                else{
                    newList.add(pascalsTriangle.get(i-1).get(j-1)+pascalsTriangle.get(i-1).get(j));
                }
            }
            pascalsTriangle.add(newList);
        }
        return pascalsTriangle;
    }
}
