public class ClimbingStairs {
    public int factorial (int num){
        int fact = 1;
        for(int i = 1;i<=num;++i){
            fact = fact * i;
        }
        return fact;
    }
    public void climbStairs(int n) {
        int ones = n, twos = 0,totalWays = 0;
        while(1*ones + 2*twos == n){
            totalWays += factorial(ones+twos);
        }
    }
}
