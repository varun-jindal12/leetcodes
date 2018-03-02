import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KeyboardKeys {
    public String[] findWords(String[] words) {
        List<String> foundWords = new ArrayList<String>();
        for(String word : words){
            int keyboardLine = 0;
            boolean isInRow = true;
            for(char character : word.toCharArray()){
                switch (character>96?character:character+32){
                    case 'q':
                    case 'w':
                    case 'e':
                    case 'r':
                    case 't':
                    case 'y':
                    case 'u':
                    case 'i':
                    case 'o':
                    case 'p':if(keyboardLine == 0){
                        keyboardLine = 1;
                    }
                    else if(keyboardLine != 1){
                        isInRow = false;
                        break;
                    }
                        break;
                    case 'a':
                    case 's':
                    case 'd':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'j':
                    case 'k':
                    case 'l':if(keyboardLine == 0){
                        keyboardLine = 2;
                    }
                    else if(keyboardLine != 2){
                        isInRow = false;
                        break;
                    }
                        break;
                    case 'z':
                    case 'x':
                    case 'c':
                    case 'v':
                    case 'b':
                    case 'n':
                    case 'm':if(keyboardLine == 0){
                        keyboardLine = 3;
                    }
                    else if(keyboardLine != 3){
                        isInRow = false;
                        break;
                    }
                }
                if(!isInRow){
                    break;
                }
            }
            if(isInRow){
                foundWords.add(word);
            }
        }
        return foundWords.toArray(new String[0]);
    }
}
