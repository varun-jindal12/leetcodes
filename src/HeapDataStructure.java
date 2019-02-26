import java.util.Arrays;
import java.util.Scanner;

public class HeapDataStructure {
    int size = 0,capacity = 10;
    int items[] = new int[capacity];

    public int getParentIndex(int childIndex){
        return (childIndex - 1)/2;
    }
    public int getLeftChildIndex(int parentIndex){
        return (parentIndex * 2) +1;
    }
    public int getRightChildIndex(int parentIndex){
        return (parentIndex * 2) + 2;
    }
    public boolean hasParent(int childIndex){
        return getParentIndex(childIndex) >= 0;
    }
    public boolean hasLeftChild(int parentIndex){
        return getLeftChildIndex(parentIndex) < size;
    }
    public boolean hasRightChild(int parentIndex){
        return getRightChildIndex(parentIndex) < size;
    }
    public int getParentVal(int childIndex){
        return items[getParentIndex(childIndex)];
    }
    public int getLeftChildVal(int parentIndex){
        return items[getLeftChildIndex(parentIndex)];
    }
    public int getRightChildVal(int parentIndex){
        return items[getRightChildIndex(parentIndex)];
    }
    public void ensureCapacity(){
        if(capacity == size){
            capacity *= 2;
            items = Arrays.copyOf(items,capacity);
        }
    }
    public void swap(int index1, int index2){
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }
    public  int peek(){
        if (size == 0)throw new IllegalStateException();
        return items[0];
    }
    public int poll(){
        if (size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[--size];
        heapifyDown();
        return item;
    }
    public void add(int element){
        ensureCapacity();
        items[size++] = element;
        heapifyUp();
        
    }

    private void heapifyUp() {
        int index = size-1;
        while(hasParent(index) && getParentVal(index)>items[index]){
            swap(getParentIndex(index),index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;

        while(hasLeftChild(index)){
            int smallChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && items[getRightChildIndex(index)]<items[smallChildIndex]){
                smallChildIndex = getRightChildIndex(index);
            }
            if(items[index] < items[smallChildIndex]){
                break;
            }
            else{
                swap(index,smallChildIndex);
                index = smallChildIndex;
            }
        }
    }
    public void runHeap(){
        String s = "y";
        int input;
        Scanner scan = new Scanner(System.in);
        HeapDataStructure hp = new HeapDataStructure();
        int element;
        while(s.equals("y")||s.equals("Y")){
            System.out.println("1. add");
            System.out.println("2. delete");
            System.out.println("3. print");
            System.out.println("4. exit");
            input = scan.nextInt();
            switch(input){
                case 1:
                    System.out.println("provide element to be added");
                    element = scan.nextInt();
                    hp.add(element);
                    break;
                case 2:
                    element = hp.poll();
                    System.out.println("deleted element: "+element);
                    break;
                case 3:
                    System.out.println("Data in heap is as follows:\n");
                    hp.print();
                    break;
                case 4:
                    s = "n";
                    break;
            }
        }
    }

    private void print() {
        if(size == 0){
            System.out.println("heap is empty");
            return;
        }
        for(int i = 0;i<size;++i){
            System.out.print(items[i]+" ");
        }
        System.out.println();
    }

}
