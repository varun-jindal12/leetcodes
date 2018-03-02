public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        for(int i = 0;i<nums.length;++i){
            totalProduct *= nums[i];
        }
        if(totalProduct == 0)return new int[nums.length];
        for(int i = 0;i<nums.length;++i){
            nums[i] = totalProduct/nums[i];
        }
        return nums;
    }
}
