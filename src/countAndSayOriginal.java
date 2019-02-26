public class countAndSayOriginal {
    public String countAndSay(String str){
        char strArray[] = str.toCharArray();
        StringBuilder countSay = new StringBuilder();
        int count = 1, length = strArray.length;
        for(int i = 1; i<length;++i){
            if(strArray[i] != strArray[i-1]) {
                countSay.append(count).append(strArray[i-1]);
                count = 1;
            }else {
                count++;
            }
        }
        if(strArray[length-1] == strArray[length-2]) countSay.append(count).append(strArray[length-1]);
        else countSay.append(1).append(strArray[length-1]);
        return new String(countSay);
    }
}
