public class IntegerSum {
    public int getSum(int a, int b) {
        /*int carry = 0;
        int bit1,bit2,i;
        char binaryArray[] = new char[100];
        String binary;
        for( i = 0;a>0 || b>0;++i){
            bit1 = a%2;
            bit2 = b%2;
            if (bit1 == 1 && bit2 == 1 && carry == 1){
                binaryArray[i]= '1';
                carry = 1;
            }
            else if(bit1 == 1 && bit2 == 1 && carry == 0){
                binaryArray[i] = '0';
                carry = 1;
            }
            else if(bit1 == 1 && bit2 == 0 && carry == 1){
                binaryArray[i] = '0';
                carry = 1;
            }
            else if(bit1 == 1 && bit2 == 0 && carry == 0){
                binaryArray[i] = '1';
                carry = 0;
            }
            else if (bit1 == 0 && bit2 == 1 && carry == 1){
                binaryArray[i]= '0';
                carry = 1;
            }
            else if(bit1 == 0 && bit2 == 1 && carry == 0){
                binaryArray[i] = '1';
                carry = 0;
            }
            else if(bit1 == 0 && bit2 == 0 && carry == 1){
                binaryArray[i] = '1';
                carry = 0;
            }
            else if(bit1 == 0 && bit2 == 0 && carry == 0){
                binaryArray[i] = '0';
                carry = 0;
            }
            a = a >> 1;
            b = b >> 1;
        }
        if (carry == 1){
            binaryArray[i] = '1';
        }
        binary = new String(binaryArray);
        System.out.println(Integer.parseInt(binary,2));
        return Integer.parseInt(new StringBuilder(new String(binaryArray)).reverse().toString(),2);*/
        int sum, carry;
        if(b == 0){
            return a;
        }
        sum = a ^ b;
        carry = (a & b) << 1;
        return getSum(sum,carry);
    }
}
