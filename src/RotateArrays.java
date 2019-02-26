public class RotateArrays {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if(k>length){
            k = k%length;
        }
        int rotatedArray[] = new int[length];

        for(int i = 0 ; i<length; i++){
            if(i<k){
                rotatedArray[i] = nums[length-k+i];
            }
            else{
                rotatedArray[i] = nums[i-k];
            }
        }
        for (int i = 0; i< length ; i++){
            nums[i] = rotatedArray[i];
        }
    }
}
