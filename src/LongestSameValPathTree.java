import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSameValPathTree {
    public int solution(int[] A, int[] E) {
        Map<Integer, Integer[]> tree = new HashMap<>();
        for(int i = 0; i<E.length;i=i+2){
            if(tree.get(E[i]) == null){
                Integer num[] = new Integer[2];
                num[0] = E[i+1];
                tree.put(E[i],num);
            }
            else{
                Integer num[] = tree.get(E[i]);
                num[1] = E[i+1];
                tree.put(E[i],num);
            }
        }
        for(int i = 1;i<=A.length;++i){
            int numToFind = i;
            List<List<Integer>> num = new ArrayList<>();
        }
        return 1;
    }

}
