public class LargestSubArray {
    public int maxSubArray(int[] nums) {
        /*int largestSum = Integer.MIN_VALUE,sum=0,length = nums.length;
        for(int i = 0;i<length;++i){
            for(int j = i;j<length;++j){
                sum += nums[j];
                if(sum>largestSum){
                    largestSum = sum;
                }
            }
            sum = 0;
        }
        return largestSum;*/
        int max_sum = Integer.MIN_VALUE;
        int cur = 0;

        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
            max_sum = Math.max(max_sum, cur);
            if(cur < 0){
                cur = 0;
            }
        }

        return max_sum;
    }
}
