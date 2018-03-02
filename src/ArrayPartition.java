import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        /*int sum = 0,temp;
        for(int i = 0;i<nums.length;++i){
            for(int j = i ;j<nums.length;++j){
                if(nums[j]<nums[i]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i = 0; i<nums.length;i+=2){
            sum +=nums[i];
        }
        return sum;*/
        /*int sum = 0,smallest=10001,secondSmallest=10002,pos1=0,pos2=1,temp;
        for(int i =0 ;i<nums.length/2;++i){
            smallest = 10001;
            secondSmallest = 10002;
            for(int j = 0;j<nums.length;++j){
                if(nums[j]>=0){

                    if(nums[j]<secondSmallest){
                       if(secondSmallest<smallest){
                           temp = secondSmallest;
                           smallest = secondSmallest;
                           secondSmallest = temp;
                           pos2 = pos1;
                           pos1 = j;
                       }

                    }
                }
            }
            System.out.println("smallest remaining is :"+smallest);
            sum+=smallest;
            nums[pos1] = -1;
            nums[pos2] = -1;
        }
        return sum;*/
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
