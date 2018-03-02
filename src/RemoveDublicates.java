public class RemoveDublicates {
    public int removeDuplicates(int[] nums) {
        /*int count = 0,length = nums.length;
        for(int i = 0 ;i<length;++i){
            if(nums[i] == nums[i-1]){
                nums[i] = 0;
                count++;
            }
        }
        return length - count;*/
        int length = nums.length, i = 0, j = 0;
        while(i<length){
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
            ++i;
        }
        return j+1;
    }
}
