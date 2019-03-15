import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int coinNum = 0;
        for(int i = coins.length-1; i>=0; i--){
            if(amount == 0){
                break;
            }
            else if(amount < coins[i]){
                continue;
            }
            coinNum += amount/coins[i];
            amount = amount % coins[i];
        }
        return amount == 0?coinNum:-1;
    }
}
