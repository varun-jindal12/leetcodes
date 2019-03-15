public class MaximumSumInLevelOfTree {
    public int maxLevelSum (int []A){
        int length = A.length, maxLevel = 0, maxSum = 0, currentLevel = 0;
        if(length == 0) return 0;
        int index = 0;
        while(index < length){
            int levelLength = (int)Math.pow(2, currentLevel);
            int sum = 0;
            for(int j = 0;j<levelLength && (j+index)
                    < length;++j){
                sum += A[j+index];
            }
            if(maxSum < sum){
                maxLevel = currentLevel;
                maxSum = sum;
            }
            index += levelLength;
            currentLevel++;
        }

        return maxLevel+1;
    }
}
