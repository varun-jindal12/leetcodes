public class ToLowerCase {
    public String toLowerCase(String str) {
        if (str == null || str.length() == 0)return "";
        StringBuilder lowerCased = new StringBuilder(str);
        int i = 0;
        for(char character:str.toCharArray()){
            if(character >= 65 && character <= 90){
                lowerCased.setCharAt(i++,(char)(character+32));
            }
            else{
                lowerCased.setCharAt(i++, character);
            }
        }
        return new String(lowerCased);
    }
}
