import java.util.ArrayList;
import java.util.List;

public class HappyNumbers {
    public boolean isHappy(int n) {
        int newNum = n,sum,digit;
        List<Integer> sumHistory = new ArrayList<Integer>();
        boolean flag = true;

        while(flag){
            sum =0;
            while (newNum > 0) {
                digit = newNum%10;
                sum += digit*digit;
                newNum = newNum/10;
            }
            if(sum == 1){
                return true;
            }
            if(sumHistory.contains(sum)){
                return false;
            }
            sumHistory.add(sum);
            newNum = sum;
        }
        return false;
    }
}
