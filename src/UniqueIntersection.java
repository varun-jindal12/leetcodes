import java.util.*;

public class UniqueIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        int uniqueInterstion[];
        Set<Integer> intersection = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length,i=0,j=0;
        while(i<length1 && j<length2 ){
            if(nums1[i]<nums2[j])i++;
            else if(nums2[j]<nums1[i])j++;
            else{
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        i=0;
        uniqueInterstion = new int[intersection.size()];
        for(int num:intersection){
            uniqueInterstion[i++] = num;
        }
        return uniqueInterstion;
    }
}
