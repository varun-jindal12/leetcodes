import java.util.HashMap;
import java.util.Map;

public class NextGreaterNum {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length1 = nums1.length, length2 = nums2.length;
        Map<Integer,Integer> nums2Keys = new HashMap<>();
        int nextGreaterNum[] = new int[length1],count = 0;
        for(int num : nums2){
            nums2Keys.put(num,count++);
        }
        for(int i = 0;i<length1;++i){
            int pos = nums2Keys.get(nums1[i])+1,num = -1;
            while(pos < length2){
                 if(nums2[pos] > nums1[i]){
                     num = nums2[pos];
                     break;
                 }
                 pos++;
            }
            nextGreaterNum[i] = num;
        }
        return nextGreaterNum;
    }
}
