public class FindPattern {
    public String findPatternIfExist(String s){
        if (s.length() == 0)return "0";
        StringBuilder match = new StringBuilder(s.substring(0,1));
//        System.out.println(match.toString()+s.charAt(0));
        for(int i = 1;i<s.length();++i){
//            System.out.println(match.equals(""));
            if(!match.equals("") && match.charAt(0) == s.charAt(i)){
                StringBuilder match2 = new StringBuilder(s.substring(i,i+1));
                boolean isMatch = true;
                i++;
                for(int j = 1;j<match.length();j++){
                    if(match.charAt(j) != s.charAt(i)){
                        match2.append(s.charAt(i));
                        isMatch = false;
                        break;
                    }
                    match2.append(s.charAt(i));
                    i++;
                }
                if(isMatch) return new String(match2);
                match.append(match2);
            }
            else match.append(s.charAt(i));
        }
        return "0";
    }
}
