public class ReverseWords {
    public String reverseWords(String s) {
        int pos =0, i = 0;
        char strArray[] = s.toCharArray(),temp;
        int length = strArray.length;
        for(;i<length;i++){
            if(strArray[i] == ' ' || i == length-1){
                int j = i == length-1?i:i-1;
                int length2 = (j-pos)/2 + pos;
                while(pos <= length2){
                    temp = strArray[pos];
                    strArray[pos] = strArray[j];
                    strArray[j] = temp;
                    j--;
                    pos++;
                }
                pos = i+1;
            }
        }
        return new String(strArray);
    }
}
