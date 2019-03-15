import java.util.List;

public class RollingString {
    public String rollingString(String str, List<String> operations){
        int rollDirection = 1;
        char[] strAsCharArray = str.toCharArray();
        for(String operation:operations){
            String[] operationArray = operation.split(" ");
            int start = Integer.parseInt(operationArray[0]);
            int end = Integer.parseInt(operationArray[1]);

            rollDirection = operationArray[2].equals("R")?1:-1;
            while( start <= end){
                char temp = strAsCharArray[start];
                if(temp == 'a' && rollDirection == -1){
                    strAsCharArray[start] = 'z';
                }
                else if(temp == 'z' && rollDirection == 1){
                    strAsCharArray[start] = 'a';
                }
                else{
                    strAsCharArray[start] = (char)(strAsCharArray[start] + (rollDirection));
                }
                start++;
            }
        }
        return new String(strAsCharArray);
    }
}
