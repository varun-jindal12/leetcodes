import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueMails = new HashSet();
        for(String email: emails){
            String[] localNameAndDomain = email.split("@");
            StringBuilder filteredLocalName = new StringBuilder();
            for(char ch: localNameAndDomain[0].toCharArray()){
                if(ch == '.'){
                    continue;
                }
                else if (ch == '+'){
                    break;
                }
                else{
                    filteredLocalName.append(ch);
                }
            }
            uniqueMails.add(filteredLocalName+localNameAndDomain[1]);
        }
        return uniqueMails.size();
    }
}
