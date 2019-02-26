import java.util.Arrays;

public class CircleSummation {
    public void printCircleSummation(int[] children, int rounds){
        int childrenCount = children.length;
        for(int k = 0;k<childrenCount;++k){
            int[] dublicate = new int[childrenCount];
            System.arraycopy( children, 0, dublicate, 0, childrenCount );
//            System.out.println(Arrays.toString(dublicate));
            int index = k;
            for(int l = 0;l<rounds;++l){
                if(index == childrenCount-1){
                    dublicate[index] += dublicate[index-1] + dublicate[0];
                    index = 0;
                }
                else if(index == 0){
                    dublicate[index] += dublicate[childrenCount-1] + dublicate[index+1];
                    index++;
                }
                else{
                    dublicate[index] += dublicate[index-1] + dublicate[index+1];
                    index++;
                }
            }
            for(int m = 0;m<childrenCount;++m){
                System.out.print(dublicate[m]+" ");
            }
            System.out.println();
        }
    }
}
