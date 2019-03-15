import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {
    private Map<String, String> numberList = new HashMap<String, String>(){{
                put("2", "abc");
                put("3", "def");
                put("4", "ghi");
                put("5", "jkl");
                put("6", "mno");
                put("7", "pqrs");
                put("8", "tuv");
                put("9", "wxyz");
    }};
    private List<String> result;
    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        if(digits.length() == 0) return result;
        stringPermutation("", digits);
        return result;
    }

    private void stringPermutation(String s, String digits) {
        if(digits.length() == 0){
            result.add(s);
            return;
        }
        String currentDigit = digits.substring(0,1);
        String charList = numberList.get(currentDigit);
        for(int i = 0; i<charList.length();++i){
            String currentCombination = s+charList.charAt(i);
            stringPermutation(currentCombination, digits.substring(1));
        }
    }
}
