import java.util.Arrays;

public class DublicateInteger {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        if(length < 2){
            return false;
        }
        Arrays.sort(nums);
        for(int i = 0; i<length-1;++i){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
