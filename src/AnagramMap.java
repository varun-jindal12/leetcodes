import java.util.HashMap;
import java.util.Map;

public class AnagramMap {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] C = new int[A.length];
        int length = A.length;
        for(int i = 0;i< length;++i){
            map.put(B[i],i);
        }

        for(int i = 0;i<length;i++){
            C[i] = map.get(A[i]);//A = {2,4,5,3} ,B = {4,5,2,3}
        }
        return C;

        /*int C[] = new int [A.length],length = A.length;

        for(int i =0;i<length;++i){
            for(int j = 0;j<length;++j){
                if(A[i] == B[j]){
                    C[i] = j;
                    break;
                }
            }
        }
        return C;*/
    }
}
