public class FindTheDifference {
    public char findTheDifference(String s, String t) {
//        char charArray[] = new char[26],
        char difference = 0;
        for(int i = 0; i<s.length();++i){
            difference ^= s.charAt(i);
            difference ^= t.charAt(i);
        }
        difference ^= t.charAt(s.length());
        return difference;
    }
}
