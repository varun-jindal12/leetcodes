import java.util.*;

public class MostFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>  topFrequentNums = new ArrayList<>();
        Map<Integer,Integer> numberCount = new HashMap<>();
        for(int num : nums){
            if(numberCount.containsKey(num)) numberCount.put(num,numberCount.get(num)+1);
            else numberCount.put(num,1);
        }
        int i = 0;
        while(i<k){
            int max = 0,topFrequentNum = 0;
            for(Map.Entry<Integer,Integer> num:numberCount.entrySet()){
                if(max < num.getValue()){
                    max = num.getValue();
                    topFrequentNum = num.getKey();
                }
            }
            topFrequentNums.add(topFrequentNum);
            numberCount.remove(topFrequentNum);
            i++;
        }
        return topFrequentNums;
    }
}
