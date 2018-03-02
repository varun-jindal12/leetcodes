public class AlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int alternating = n %2 ;
        while(n>0){
            if(n%2 != alternating){
                return false;
            }
            alternating = alternating == 0?1:0;
            n = n>>1;
        }
        return true;
    }
}
