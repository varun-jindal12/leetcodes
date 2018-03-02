public class NeedleInHaystack {
    public int strStr(String haystack, String needle) {
        int pos = -1,haystackLength = haystack.length(),needleLength = needle.length();
        if(haystackLength == 0 && needleLength == 0){
            return 0;
        }
        else if (haystackLength == 0 || needleLength == 0){
            return needleLength == 0 ? 0 :-1;
        }
        char firstNeedleChar = needle.charAt(0);
        for(int i = 0 ;i < haystackLength;i++){
            if(haystack.charAt(i) == firstNeedleChar){
                boolean flag = true;
                pos = i;
                if(i+needleLength -1 > haystackLength && needleLength != 1){
                    return - 1;
                }
                for(int j = 1;j<needleLength;++j){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return pos;
                }
            }
        }
        return -1;
    }
}
