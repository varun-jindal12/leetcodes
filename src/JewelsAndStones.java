import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> jewels = new HashSet<>();
        for(char character: J.toCharArray()) jewels.add(character);
        for(char character : S.toCharArray()){
            if(jewels.contains(character)){
                count++;
            }
        }
        return count;
    }
}
