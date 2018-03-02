public class SingleNumber {
    public int singleNumber(int[] nums) {
        /*int singleNumber, flag;
        for (int i = 0; i < nums.length; ++i) {
            flag = 0;
            if (nums[i] > -10000) {
                for (int j = i + 1; j < nums.length; ++j) {
                    if (nums[j] > -10000) {
                        if (nums[i] == nums[j]) {
                            flag = 1;
                            nums[i] = -10000;
                            nums[j] = -10000;
                            break;
                        }
                    }

                }

                if (flag == 0) {
                    return nums[i];
                }
            }

        }
        return -1;*/
        int singleNumber = 0;
        for(int i = 0;i<nums.length;++i){
            singleNumber = singleNumber ^ nums[i];
        }
        return singleNumber;
    }
}
