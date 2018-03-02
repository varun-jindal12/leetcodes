public class PlusOne {
    public int[] plusOne(int[] digits) {
        int plusOneDigits[], carry = 0, length = digits.length,one = 1;
        plusOneDigits = new int[length];
        for (int i = length - 1; i >= 0; --i) {
            if (digits[i] + one + carry == 10) {
                plusOneDigits[i] = 0;
                carry = 1;
                one = 0;
            } else {
                plusOneDigits[i] = digits[i] + one + carry;
                carry = 0;
                one = 0;
            }
        }
        if(carry == 1){
            int largerOnePlusDigit[] = new int[length+1];
            largerOnePlusDigit[0] = 1;
            return largerOnePlusDigit;
        }
        return plusOneDigits;
    }
}
