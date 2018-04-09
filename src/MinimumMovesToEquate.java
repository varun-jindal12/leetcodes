import java.util.stream.IntStream;

public class MinimumMovesToEquate {
    public int minMoves(int[] nums) {
        /*if(nums == null || nums.length == 0)return 0;
        int moveCount = 0,pos = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        while (max != min){
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            for(int i = 0; i<nums.length;i++){
                if(nums[i] > max){
                    max = nums[i];
                    pos = i;
                }
                if(nums[i] < min)min = nums[i];
            }
            if(max == min)return moveCount;
            for(int i = 0; i<nums.length;++i){
                if(i != pos)nums[i]++;
            }
            moveCount++;
        }
        return moveCount;*/
        return IntStream.of(nums).sum() - nums.length * IntStream.of(nums).min().getAsInt();
    }
}
