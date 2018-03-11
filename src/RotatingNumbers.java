public class RotatingNumbers {
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 1; i <= N; ++i) {
            int num = i;
            boolean isDifferent = false, isValid = true;
            while (num > 0) {
                int digit = num % 10;
                switch (digit) {
                    case 0:
                    case 1:
                    case 8:
                        break;
                    case 2:
                    case 5:
                    case 6:
                    case 9:
                        isDifferent = true;
                        break;
                    case 3:
                    case 4:
                    case 7:
                        isValid = false;
                        break;
                }
                if(!isValid) break;
                num /= 10;
            }
            if(isValid && isDifferent){
                count++;
            }
        }
        return count;
    }
}
