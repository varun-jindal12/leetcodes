import java.util.Arrays;

public class CompareVersionNumbers {
    public int compareVersionNumbers(String version1, String version2){
        String[] v1,v2;
        v1 = version1.split("\\.");
        v2 = version2.split("\\.");
        int index = 0;
        while(index<v1.length && index<v2.length){
            if(Integer.parseInt(v1[index]) > Integer.parseInt(v2[index])){
                return 1;
            }
            else if(Integer.parseInt(v1[index]) < Integer.parseInt(v2[index])){
                return -1;
            }
            index++;
        }
        while(index<v1.length){
            if(Integer.parseInt(v1[index])>0){
                    return 1;
            }
            index++;
        }
        while(index<v2.length){
            if(Integer.parseInt(v2[index])>0){
                return -1;
            }
            index++;
        }
        return 0;
        // if(v1.length == v2.length) return 0;
        // return v1.length>v2.length?1:-1;
    }
}
