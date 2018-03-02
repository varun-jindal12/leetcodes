public class ExcelTitle {
    public int titleToNumber(String s) {
        char strArray[] = s.toCharArray();
        int num = 0;
        int length = strArray.length - 1;
        for (int i = 0; i <= length; ++i) {
            if (length - i > 0) {
                num += ((int) strArray[i] - 64) * (Math.pow(26, length - i));
            } else {
                num += ((int) strArray[i] - 64);
            }
        }
        return num;
    }
    /*int result = 0;
    for (int i = 0; i < s.length(); result = result * 26 + (s.charAt(i) - 'A' + 1), i++);
    return result;*/
}
