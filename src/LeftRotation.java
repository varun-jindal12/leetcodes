public class LeftRotation {
    public void leftRotate(int a[], int rotationFactor){
        for(int i = rotationFactor;i<a.length;++i){
            System.out.print(a[i]+" ");
        }
        for(int i = 0;i<rotationFactor;++i){
            System.out.print(a[i]+" ");
        }
    }
}
