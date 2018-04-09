import java.util.Arrays;
import java.util.Set;

public class FindPairs {
    public int findNumOfPair(int nums[],int goal){
        /*int count = 0;
        for(int i = 0;i<nums.length;++i){
            for(int j = i+1;j<nums.length;++j){
                if(nums[i]+nums[j] == goal)count++;
            }
        }*/
        Arrays.sort(nums);
        int l = 0, r=nums.length-1;
        int result = 0;
        while(l<r){
            if(nums[l]+nums[r]<goal){
                result = result + (r - l);
                l++;
            }
            else{
                r--;
            }
        }
        return result;
    }
}
