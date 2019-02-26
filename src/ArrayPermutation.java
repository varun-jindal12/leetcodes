import java.util.Arrays;
import java.util.Collections;

public class ArrayPermutation {
    static String twoArrays(int k, int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0;i<A.length;++i){
            if(A[i] + B[A.length-1-i]>= k){
                return "NO";
            }
        }
        return "YES";
    }
}
