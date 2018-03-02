public class RomanToInt {
    public int romanToInt(String s) {
        char[] arrayStr = s.toCharArray();
        int length = arrayStr.length, integer = 0;
        for (int i = 0; i < length; ++i) {
            switch (arrayStr[i]) {
                case 'M':
                    if (i > 0 && arrayStr[i - 1] == 'C') {
                        integer += 800;
                    } else integer += 1000;
                    break;
                case 'D':
                    if (i > 0 && arrayStr[i - 1] == 'C') {
                        integer += 300;
                    } else integer += 500;
                    break;
                case 'C':
                    if (i > 0 && arrayStr[i - 1] == 'X') {
                        integer += 80;
                    } else integer += 100;
                    break;
                case 'L':
                    if (i > 0 && arrayStr[i - 1] == 'X') {
                        integer += 30;
                    } else integer += 50;
                    break;
                case 'X':
                    if (i > 0 && arrayStr[i - 1] == 'I') {
                        integer += 8;
                    } else integer += 10;
                    break;
                case 'V':
                    if (i > 0 && arrayStr[i - 1] == 'I') {
                        integer += 3;
                    } else integer += 5;
                    break;
                case 'I':
                    integer += 1;
                    break;
            }
        }
        return integer;
    }
}
