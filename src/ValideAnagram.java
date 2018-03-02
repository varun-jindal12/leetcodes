public class ValideAnagram {
    public boolean isAnagram(String s, String t) {
        int character[] = new int[26],length1 = s.length(),length2 = t.length();
        if(length1 != length2){
            return false;
        }
        for(int i = 0; i <length1;++i){
            character[s.charAt(i) - 'a']++;
            character[t.charAt(i) - 'a']--;
        }
        for(int count:character){
            if(count !=0){
                return false;
            }
        }
        return true;
    }
}
