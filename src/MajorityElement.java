import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        /*int count = 0,majorityNum = nums.length/2;
        for(int i = 0;i<nums.length;++i){
            count = 0;
            for(int j = i+1;j<nums.length;++j){
                if(nums[i] == nums[j]){
                    count++;
                    if(count>majorityNum){
                        return nums[i];
                    }
                }
            }

        }
        return 0;*/
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
