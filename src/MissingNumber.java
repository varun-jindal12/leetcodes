import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        /*Arrays.sort(nums);
        int length = nums.length,i=0;
        for(i = 0;i< length;++i){
           if(nums[i] != i){
               return i;
           }
        }
        return i;*/
            int length = nums.length, sum = 0, i = 0,sum2=0;
            for(; i<length;++i){
                sum = sum + nums[i];
                sum2 = sum2 + i;
            }
            if(sum == sum2){
                return i;
            }
            sum2 = sum2 +i;
            return sum2-sum;
    }
}
