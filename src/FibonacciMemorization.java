public class FibonacciMemorization {
    public int fibonacci(int n){
        int sum;
        int[] memo = new int[n+1];
        sum = getFibonacci(n,memo);
        return sum;
    }

    private int getFibonacci(int n, int[] memo) {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else if(memo[n] == 0){
            memo[n] = getFibonacci(n-1,memo) + getFibonacci(n-2,memo);
        }
        return memo[n];
    }
}
