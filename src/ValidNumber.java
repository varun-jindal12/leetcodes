public class ValidNumber {
    public boolean isNumber(String s) {
        char arrayStr[] = s.toCharArray();
        int length = arrayStr.length, digitCount = 0;
        if (arrayStr[0] == 'e' || (length>1 && arrayStr[1] == 'e' && arrayStr[0] == '0' )) {
            return false;
        }
        for (int i = 0; i < length; ++i) {
//            if ((arrayStr[i] >= 48 && arrayStr[i] <= 57) || arrayStr[i] == 101 || (arrayStr[i] == 32 && length > 1) || (arrayStr[i] == 46 && length > 1)) {
            if(arrayStr[i] == 101 || (arrayStr[i] == 32) || arrayStr[i] == 46 ){
                continue;
            }
            else if (arrayStr[i] >= 48 && arrayStr[i] <= 57){
                digitCount++;
            } else return false;
        }
        if (digitCount > 0) {
            return true;
        }
        return false;
    }
}
