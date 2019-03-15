public class LongestPalandromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length() == 0) return "";
        int left = 0, right = 0, maxLength = 0;
        for(int index = 0; index<s.length();++index){
            int len1 = checkPalindrome(s, index, index);
            int len2 = checkPalindrome(s, index, index+1);
            int len = Math.max(len1, len2);
            if(maxLength < len){
                left = index - (len-1)/2;
                right = index + (len/2);
                maxLength = len;
            }
        }
        return s.substring(left, right+1);
    }

    public int checkPalindrome (String s, int left, int right){

        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left -1;
    }
}
