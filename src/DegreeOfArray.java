import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DegreeOfArray {
    public int findShortestSubArray(int[] nums) {

        Map<Integer,Integer> numFreq = new HashMap<>();
        Map<Integer,Integer[]> numRange = new HashMap<>();
        int degree = 0,minLength = nums.length;
        for(int i = 0; i<nums.length;i++){
            numFreq.put(nums[i],numFreq.getOrDefault(nums[i],0)+1);
            degree = Math.max(degree,numFreq.get(nums[i]));
            if(numRange.get(nums[i]) == null){
                numRange.put(nums[i],new Integer[2]);
            }
            Integer curNumRange[] = numRange.get(nums[i]);
            if(curNumRange[0] == null)curNumRange[0] = i;
            curNumRange[1] = i;
        }
        for(Map.Entry<Integer,Integer> num:numFreq.entrySet()){
            if(num.getValue() != degree)continue;
            Integer curNumRange[] = numRange.get(num.getKey());
            minLength = Math.min(minLength,curNumRange[1] - curNumRange[0] + 1);
        }
        return minLength;
    }
}
