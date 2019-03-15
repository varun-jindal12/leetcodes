public class PowerOf2 {
    public boolean powerOf2 (int num){
        return num>0 && (num &(num-1)) == 0;
    }
}
