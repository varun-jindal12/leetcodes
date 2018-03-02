public class powerOfThree {
    public boolean isPowerOfThree(int n) {
        int checkNum = 1162261467;
        if(n == 0){
            return false;
        }
        else if(checkNum % n == 0){
            return true;
        }
        return false;
    }
}
