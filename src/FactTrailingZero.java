public class FactTrailingZero {
    public int trailingZeroes(int n) {
        int trailingZero = 0;
        while(n >= 5){
            trailingZero += n/5;
            n /= 5;
        }
        return trailingZero;
    }
}
