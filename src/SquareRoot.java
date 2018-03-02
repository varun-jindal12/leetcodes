public class SquareRoot {
    public int mySqrt(int x) {
        /*int sqrt;
        for(int i = 0; i<=x;++i){
            if (i*i > x){
                return i-1;
            }
            else if(i*i == x){
                return i;
            }
        }
        return 0;*/
        int  low = 0, high = x, mid = x/2;
        while (low < high){
            if(mid * mid < x){
                low = mid + 1;
                mid = (low + high) /2;
            }
            else if( mid * mid > x){
                high = mid - 1;
                mid = (low + high) /2;
            }
            else {
                return mid;
            }
        }
        return low*low<=x?low:low-1;
    }
}
