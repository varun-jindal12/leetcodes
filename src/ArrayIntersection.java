import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ArrayIntersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        /*List<Integer> intersection = new ArrayList<>();
        int uniqueVal = -1000;
        for(int i = 0;i<nums1.length;++i){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    intersection.add(nums1[i]);
                    nums1[i] = uniqueVal;
                    nums2[j] = uniqueVal;
                    break;
                }
            }
        }
//        int[] intersectionInt =
        int length = intersection.size();
        int interSectionArray[] = new int[length];
        for(int i = 0;i<length;i++){
            interSectionArray[i] = intersection.get(i);
        }
        return interSectionArray;*/
//                return intersection.stream().mapToInt(Integer::intValue).toArray();

        List<Integer> intersection = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ptr1 = 0 ,ptr2 = 0,length1 = nums1.length,length2 = nums2.length;
        while(ptr1<length1 && ptr2 <length2){
            if(nums1[ptr1] < nums2[ptr2]){
                ptr1++;
            }
            else if(nums1[ptr1] > nums2[ptr2]){
                ptr2++;
            }
            else{
                intersection.add(nums1[ptr1]);
                ptr1++;
                ptr2++;
            }
        }
        int length = intersection.size();
        int interSectionArray[] = new int[length];
        for(int i = 0;i<length;i++){
            interSectionArray[i] = intersection.get(i);
        }
        return interSectionArray;
    }
}
