public class RangeAddition {
    public int maxCount(int m, int n, int[][] ops) {
//        int matrix[][] = new int[m][n]
        int minA = m, minB = n;
        for(int i = 0; i<ops.length;++i){
//            int a = ops[i][0] , b = ops[i][1];
            if(ops[i][0]<minA) minA = ops[i][0];
            if(ops[i][1]<minB) minB = ops[i][1];
        }
        return minA*minB;
    }
}
