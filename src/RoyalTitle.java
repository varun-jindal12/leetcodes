import java.util.Arrays;

public class RoyalTitle {
    public String[] sortedTitles(String[] names){
        RomanToInt romanToInt = new RomanToInt();
//        String sortedName[] = Arrays.copyOf(names,names.length);
        String splitVal[][] = new String[names.length][2];
//        Arrays.sort(names);
        for(int i=0; i<names.length;i++){
            splitVal[i] = names[i].split(" ");
        }
        for(int i = 0;i<names.length;++i){
            if(splitVal[i][0].compareTo(splitVal[i+1][0])<0){
                String temp = splitVal[i][0];
                splitVal[i][0] = splitVal[i+1][0];
                splitVal[i+1][0] = temp;
            }
//            else if()
        }

        return names;
    }
}
