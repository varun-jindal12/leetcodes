import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String morseCodeTable[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> uniqueMorseCodes = new HashSet<>();
        for(String word: words){
            StringBuilder morseWord = new StringBuilder();
            for(char letter:word.toCharArray()){
                morseWord.append(morseCodeTable[letter - 97]);
            }
//            uniqueMorseCodes.put(morseWord.toString(),uniqueMorseCodes.getOrDefault(morseWord.toString(),0)+1);
            uniqueMorseCodes.add(morseWord.toString());
        }
        return uniqueMorseCodes.size();
    }
}
