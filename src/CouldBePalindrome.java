import java.util.Arrays;

public class CouldBePalindrome {
    public boolean checkPalindrome(String s){
        char character = s.charAt(0);
        char sortedList[] = s.toCharArray();
        Arrays.sort(sortedList);
        System.out.println(sortedList);
        for(int i = 1;i<s.length();++i){
            character ^= s.charAt(i);
        }
        return (character >= 97 && character <= 122);
    }
}
