public class HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        char[] str = Integer.toBinaryString(n).toCharArray();

        for(char character:str){
            if(character == '1'){
                count++;
            }
        }
        /*while(n>0){
            if (n % 2 == 1){
                count++;
            }
            n = n>>1;
        }*/
        return count;
    }
}
