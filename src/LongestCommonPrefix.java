public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }
        try {
            while (i < strs[0].length()) {
                char character = strs[0].charAt(i);
                boolean isEqual = true;
                for (String s : strs) {
                    if (s.charAt(i) != character) {
                        isEqual = false;
                    }
                }
                if (!isEqual) {
                    return strs[0].substring(0, i);
                }
                ++i;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return i == 0 ? "" : strs[0].substring(0, i);
        }
        return strs[0].substring(0,i);
    }
}
