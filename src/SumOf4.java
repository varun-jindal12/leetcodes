import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumOf4 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> InterMediateSum = new HashMap<>();
        int length = A.length;
        for(int i = 0; i < length;i++){
            for(int j = 0; j< length;j++){
                int sum = C[i]+D[j];
                InterMediateSum.put(sum,InterMediateSum.getOrDefault(sum,0)+1);
            }
        }
        int count = 0;
        for(int i = 0;i<length;++i){
            for(int j = 0;j<length;++j){
//                int sum = -A[i]-B[j];
                count += InterMediateSum.getOrDefault(-A[i]-B[j],0);
            }
        }
        return count;
    }
}
