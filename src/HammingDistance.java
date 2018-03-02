public class HammingDistance {
    /*public int hammingDistance(int x, int y) {
        char first[] = Integer.toBinaryString(x).toCharArray(), second[] = Integer.toBinaryString(y).toCharArray();
        int count = 0;
//        System.out.println("first = "+first[0]+"second = "+ second[0]);
        for(int i = first.length-1, j = second.length-1;i>= 0 || j>=0;--i,--j){
            if(i>= 0 && j>=0){
                if(first[i] != second[j]){
                    count++;
                }
            }
            else if(i<0){
                if(second[j] == '1'){
                    count++;
                }
            }
            else{
                if(first[i] == '1'){
                    count++;
                }
            }

        }
        return count;
    }*/
    public int hammingDistance (int x, int y){
        int distance = 0, a = x,b = y;
        while(a>0&& b>0){
            if (a%2 != b%2){
                distance++;
            }
            a = a>>1;
            b = b>>1;
        }
        return distance;
    }
}
