import java.util.*;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int array[] = new int[10001];
        int value1 = 0 ,value2 = 0,value1i,value2i;
        for(int num : nums) array[num] += num;
        for(int i = 0 ;i<10001;++i){
            value1i = value2  + array[i];
            value2i = Math.max(value1,value2);
            value1 = value1i;
            value2 = value2i;
//            Integer.M
        }
    return Math.max(value1,value2);
    }
}
