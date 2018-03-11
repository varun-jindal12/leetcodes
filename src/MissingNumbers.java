import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNums = new ArrayList<>();
        for(int num: nums){
            int index = Math.abs(num)-1;
            if(nums[index]>0){
                nums[index] = -nums[index];
            }
        }
        for(int i = 0;i<nums.length;++i){
            if(nums[i]>0){
                disappearedNums.add(i+1);
            }
        }
        return disappearedNums;
    }
}
