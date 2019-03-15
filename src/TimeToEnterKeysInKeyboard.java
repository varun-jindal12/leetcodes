import java.util.HashMap;
import java.util.Map;

public class TimeToEnterKeysInKeyboard {
    public int getTime(String s1, String s2){
        int totalTime = 0;
        if(s2.length()== 0)return totalTime;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        char[] s1ToCharArray = s1.toCharArray();
        for(int index = 0 ; index< s1ToCharArray.length;index++){
            characterIntegerMap.put(s1ToCharArray[index], index);
        }
        int lastIndex = 0;
        for(char ch : s2.toCharArray()){
            int currentIndex = characterIntegerMap.get(ch);
            totalTime += Math.abs(currentIndex - lastIndex);
            lastIndex = currentIndex;
        }

        return totalTime;
    }
}
