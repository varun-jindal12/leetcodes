public class NumberComplement {
    public int findComplement(int num) {
        String binary;
        char binaryArray[] = Integer.toBinaryString(num).toCharArray();
        for(int i = 0 ;i<binaryArray.length;++i){
            if(binaryArray[i] == '1'){
                binaryArray[i] = '0';
            }
            else{
                binaryArray[i] = '1';
            }
        }
        binary = new String(binaryArray);
        return Integer.parseInt(binary,2);
    }
}
