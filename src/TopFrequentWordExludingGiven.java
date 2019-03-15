import java.util.*;

public class TopFrequentWordExludingGiven {
    public List<String> retrieveMostFrequestWords(String text, List<String> wordsToExclude){
        if(text.equals(""))return new ArrayList<>();
        List<String> result = new ArrayList<>();
        int maxFrequency = 0;
        text = text.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        Set<String> mySet = new HashSet<>();
        for(String wordsExclude:wordsToExclude){
            mySet.add(wordsExclude.toLowerCase());
        }
        String[] words = text.split("\\W+");
        for(String word: words){
            if(!mySet.contains(word) && !word.equals("")){
                int count = map.getOrDefault(word, 0);
                map.put(word, count+1);
                maxFrequency = count+1> maxFrequency?count+1:maxFrequency;
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet() ){
            if(entry.getValue() == maxFrequency ){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
