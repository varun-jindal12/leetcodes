public class CountSay {
    public String countAndSay(int n) {
        String countAndSayArray[] = new String[n];
        countAndSayArray[0] = "1";
        for(int i = 1;i<n;i++){
            String prevNum = countAndSayArray[i-1];
            StringBuilder curNum = new StringBuilder("");
            int count = 0, j = 1, length = prevNum.length();
            while(j<length){
                if(prevNum.charAt(j)== prevNum.charAt(j-1)){
                    count++;
                }
                else{
                    curNum.append(count+1);
                    curNum.append(prevNum.charAt(j-1));
                    count = 0;
                }
                j++;
            }
            curNum.append(count+1);
            curNum.append(prevNum.charAt(j-1));
            countAndSayArray[i] = curNum.toString();
        }
        return countAndSayArray[n-1];
    }
}
