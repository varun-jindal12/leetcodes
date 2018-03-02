public class FirstUnique {
    public int firstUniqChar(String s) {
        char strArray[] = s.toCharArray();
        int length = strArray.length,i,j,flag;
        for( i = 0;i<length;++i){
            flag = 0;
            for( j = 0;j<length;++j){

                if(i != j){
                    if(strArray[i] == strArray[j]){
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0){
                return i;
            }
        }
        return -1;
    }
}
