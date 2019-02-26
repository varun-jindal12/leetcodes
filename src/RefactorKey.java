public class RefactorKey {
    public String solution(String S, int K) {
        String subS = S.replaceAll("-", "");
        int numOfCharacters = subS.length();
        int firstLen = numOfCharacters % K;
        StringBuilder refactoredKey = new StringBuilder();
        int i = 0;
        if (firstLen != 0) {
            while (i < firstLen) {
                refactoredKey.append(Character.isDigit(subS.charAt(i)) ? subS.charAt(i) : Character.toUpperCase(subS.charAt(i)));
                i++;
            }
            refactoredKey.append('-');
        }

        for (int count = 0; i < subS.length(); ++i) {

            if (count == K) {
                count = 0;
                refactoredKey.append("-").append(Character.isDigit(subS.charAt(i)) ? subS.charAt(i) : Character.toUpperCase(subS.charAt(i)));
                count++;
            } else {
                refactoredKey.append(Character.isDigit(subS.charAt(i)) ? subS.charAt(i) : Character.toUpperCase(subS.charAt(i)));
                count++;
            }

        }
        return new String(refactoredKey);
    }
}
