import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountBitPrime {
    public int countPrimeSetBits(int L, int R) {
        Set<Integer> primeNums = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19));
        int bitPrime = 0;
        for(int i = L;i <=R;++i){
            int bitCount = 0,currNum = i;
            while(currNum>0){
                if(currNum%2 ==1)bitCount++;
                currNum = currNum>>1;
            }
            if(primeNums.contains(bitCount))bitPrime++;
        }
        return bitPrime;
    }
}
