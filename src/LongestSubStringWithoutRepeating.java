import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int longestLength = 0;
        char[] stringAsCharArray = s.toCharArray();
        Map<Character,Integer> longestSubstringWithoutRepeatingChar = new HashMap<>();
        for(int index = 0; index<stringAsCharArray.length;index++){
            if(longestSubstringWithoutRepeatingChar.containsKey(stringAsCharArray[index])){
                index = longestSubstringWithoutRepeatingChar.get(stringAsCharArray[index]);
                longestSubstringWithoutRepeatingChar.clear();
            }
            else{
                longestSubstringWithoutRepeatingChar.put(stringAsCharArray[index], index);
                longestLength = Math.max(longestLength, longestSubstringWithoutRepeatingChar.size());
            }
        }

        return longestLength;
    }
}
