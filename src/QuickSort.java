import java.util.List;

public class QuickSort {
    public List<Integer> quickSort(List<Integer> nums){
        int start = 0, end = nums.size();
        quickSortRec(nums,start,end-1);
        return nums;
    }

    private void quickSortRec(List<Integer> nums, int start, int end) {
        if(start<end){
            int pivot = findPivot(start,end,nums);
            quickSortRec(nums,start,pivot-1);
            quickSortRec(nums,pivot+1,end);
        }
    }

    private int findPivot(int start, int end, List<Integer> nums) {
        int pivotPos = start,pivotElement = nums.get(end);
        for(int i = start;i<=end-1;i++){
            if(nums.get(i) <= pivotElement){
                int temp = nums.get(i);
                nums.set(i,nums.get(pivotPos));
                nums.set(pivotPos,temp);
                pivotPos++;
            }
        }
        int temp = nums.get(end);
        nums.set(end,nums.get(pivotPos));
        nums.set(pivotPos,temp);
        return pivotPos;
    }
}
