import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        Stack<String> paranthesesStack = new Stack<>();
        int count = 0;
        try{
            for(char character:s.toCharArray()){
                switch(character){
                    default:continue;
                    case '{':
                    case '[':
                    case '(': paranthesesStack.push(Character.toString(character));
                        count++;
                        break;
                    case '}': if(!paranthesesStack.pop().equals("{")){
                        return false;
                    }
                        count--;
                        continue;
                    case ']': if(!paranthesesStack.pop().equals("[")){
                        return false;
                    }
                        count--;
                        continue;
                    case ')': if(!paranthesesStack.pop().equals("(")){
                        return false;
                    }
                        count--;
                        break;
                }
            }
        }
        catch(EmptyStackException e){
            return false;
        }
        return count == 0;
    }
}
