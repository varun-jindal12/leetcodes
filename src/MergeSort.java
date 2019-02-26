public class MergeSort {
    public int[] runMergeSort(int[] nums){
        int left = 0,right = nums.length-1;
        mergeSortRec(nums, left, right);
        return nums;
    }

    private void mergeSortRec(int[] nums, int left, int right) {
        if(left < right){
            int mid = (left + right)/2;
            mergeSortRec(nums, left, mid);
            mergeSortRec(nums,mid+1, right);
            merge(nums, left, mid, right);
        }

    }

    private void merge(int[] nums, int left, int mid, int right) {
        int i, j, k = left;
        int n1 = mid - left +1;
        int n2 = right - mid;

        int[] a1 = new int[n1], a2 = new int[n2];
        for(i = 0;i < n1;++i){
            a1[i] = nums[i+left];
        }
        for(j = 0;j<n2;++j){
            a2[j] = nums[j+mid+1];
        }
        i = 0;
        j = 0;
        while(i<n1 &&j<n2){
            if(a1[i] < a2[j]) {
                nums[k] = a1[i];
                i++;
            }else{
                nums[k] = a2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            nums[k++] = a1[i++];
        }
        while(j<n2){
            nums[k++] = a2[j++];
        }

    }
}
