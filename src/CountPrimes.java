import java.util.ArrayList;
import java.util.List;

public class CountPrimes {
    public int countPrimes(int n) {
        boolean notPrimes[] = new boolean[n];
        int primeCount = 0;
        for(int i = 2;i<n;++i){
            if(!notPrimes[i]) {
                for (int j = 2; i * j < n; ++j) {
                        notPrimes[i*j] = true;
                }
            }
        }
        for(int i = 2;i<n;++i){
            if(!notPrimes[i]){
                primeCount++;
            }
        }
        return primeCount;
    }
}
