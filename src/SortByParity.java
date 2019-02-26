import java.util.Arrays;

public class SortByParity {
    public int[] sortArrayByParity(int[] A) {
//        Arrays.sort(A); // only required if the array you want is sorted one
        int length = A.length;
        int j = 0;
        for(int i = 0;i<length - 1;i++){
            if(A[i]%2 == 0 && i == j){
                j++;
            }
            else if(A[i]%2 == 0){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j++;
            }
        }
        if(A[length-1]%2 == 0){
            int temp = A[length-1];
            A[length-1] = A[j];
            A[j] = temp;
        }
        return A;
    }
}
