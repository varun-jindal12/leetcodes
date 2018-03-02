public class ReverseBits {
    public int reverseBits(int n) {
        StringBuilder str = new StringBuilder(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n));
        str.reverse();
        int length = 32 - str.length();
        for(int i = 0;i<length;++i){
            str.append("0");
        }
        System.out.println(str);
        return Integer.parseInt(str.toString(),2);
    }
}
