public class AddParanthesis {
    public String addParanthisis(String str){
        StringBuilder retStr = new StringBuilder();
        int openCount = 0, closeCount = 0;
        for(int i = 0; i<str.length();++i){

            if(closeCount < openCount){
                retStr.append(str.charAt(i));
                if(str.charAt(i) == '('){
                    openCount++;
                }
                else {
                    closeCount++;
                }
            }
            else if (closeCount == openCount && str.charAt(i) == ')'){
                retStr.append('(');
                retStr.append(str.charAt(i));
                openCount++;
                closeCount++;
            }
            else{
                retStr.append(str.charAt(i));
                openCount++;
            }
        }
        for(int i = 0 ; i< (openCount - closeCount );++i){
            retStr.append(')');
        }
        return new String(retStr);
    }
}
