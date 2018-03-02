public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length1 = m-1,length2 = n-1,finalLength = m+n - 1;
        while(length1 >= 0 && length2 >= 0){
            nums1[finalLength--] = nums1[length1] > nums2[length2]?nums1[length1--]:nums2[length2--];
        }
        while(length2>=0){
            nums1[finalLength--] = nums2[length2--];
        }
    }
}
