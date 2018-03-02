import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        /*HashMap<Integer,Integer> numbers = new HashMap<>();
        int targetSumLocation[] = new int[2],i = 0,k=0,j = 0,dublicateSolTarget[] = new int[2];
        for(int num : nums){
            numbers.put(i,num);
            i++;
        }
        for(i = 0; i < nums.length;++i){
            if(numbers.containsValue(target - nums[i])){
               if(target - nums[i] == nums[i]){
                   dublicateSolTarget[k] = i;
                   ++k;
               }else {
                   targetSumLocation[j] = i;
                   ++j;
               }
            }
            if(j>1||k>1){
                return k == 2?dublicateSolTarget:targetSumLocation;
            }
        }
        return targetSumLocation;*/
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
