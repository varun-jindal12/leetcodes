public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int length = word.length();
        boolean isUpper = false;
        if(length == 1) return true;
        char wordArray[] = word.toCharArray();
        for(int i = 1; i<length;++i){
            if( i == 1 && Character.isUpperCase(wordArray[i]) && Character.isUpperCase(wordArray[i-1])){
                isUpper = true;
            }
            else if (isUpper){
                if(Character.isLowerCase(wordArray[i]))return false;
            }
            else{
                if(Character.isUpperCase(wordArray[i]))return false;
            }
        }
        return true;
    }
}
