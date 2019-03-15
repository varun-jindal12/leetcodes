import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        //int counter = 1;
        for(Integer num : nums){
            priorityQueue.add(num);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }
        return  priorityQueue.poll();
    }
}
