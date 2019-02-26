public class ProductExceptSelf {
    /*public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        for(int i = 0;i<nums.length;++i){
            totalProduct *= nums[i];
        }
        if(totalProduct == 0)return new int[nums.length];
        for(int i = 0;i<nums.length;++i){
            nums[i] = totalProduct/nums[i];
        }
        return nums;
    }*/
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0)return nums;
        int [] leftNum = new int[nums.length];
        leftNum[0] = 1;
        int totalProduct = 1;
        for(int i = 1; i<nums.length; ++i){
            totalProduct *= nums[i-1];
            leftNum[i] = totalProduct;
        }
        totalProduct = 1;
        for(int i = nums.length-2;i>=0;i--){
            int temp = nums[i+1];
            nums[i+1] = totalProduct*leftNum[i+1];
            totalProduct *= temp;
        }
        nums[0] = totalProduct;
        return nums;
    }
}
