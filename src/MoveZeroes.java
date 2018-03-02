public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        /*int zeroCount = 0,length = nums.length,zeroPos =0;
        for(int i = 0; i<length;++i){
            *//*if(i != 0 && nums[i-1] == 0){
                zeroPos = i-1;
                zeroCount++;
            }*//*
            if(nums[i] == 0){
                if(zeroCount == 0){
                    zeroPos = i;
                }
                zeroCount++;
                continue;
            }
            if(zeroCount > 0 && nums[i] != 0){
                nums[zeroPos] = nums[i];
                nums[i] = 0;
                zeroPos++;
                zeroCount--;
            }
        }
        System.out.println(nums.toString());*/
        int pos = 0, length = nums.length;
        for(int i =0;i<length;++i){
            if(nums[i] != 0){
                if( i == pos){
                    pos++;
                }
                else {
                    nums[pos] = nums[i];
                    nums[i] = 0;
                    pos++;
                }
            }
        }
       /* for(int num:nums){
            System.out.println(num);
        }*/
    }
}
