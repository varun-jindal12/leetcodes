import java.util.Arrays;

public class BikeRacks {
    public int solution(int[] A) {
        int maxDiff = 0,sameRackNumber = A[0];
        boolean oneRack = true;
        if(A.length <1){
            return 0;
        }
        Arrays.sort(A);
        for(int i = 0 ;i<A.length-1;++i){
           if(maxDiff < A[i+1] - A[i]){
               maxDiff = A[i+1] - A[i];
           }
           if(sameRackNumber != A[i]){
               oneRack = false;
           }
        }
        return oneRack?0:maxDiff/2;
    }
}
