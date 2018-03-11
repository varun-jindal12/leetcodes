public class MaxConsecutiveOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOneCount = 0;
        for(int i = 0; i< nums.length;i++){
            if(nums[i] == 1){
                int tempCount = 0;
                while(i < nums.length && nums[i] == 1){
                    tempCount ++;
                    i++;
                }
                if(tempCount > maxConsecutiveOneCount){
                    maxConsecutiveOneCount = tempCount;
                }
            }
        }
        return maxConsecutiveOneCount;
    }
}
