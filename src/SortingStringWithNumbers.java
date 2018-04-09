import java.util.Arrays;
import java.util.Comparator;

public class SortingStringWithNumbers{
    public String[] sortByNumbers(String[] str){
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int a = Integer.valueOf(o1.replaceAll("[^0-9]",""));
                int b = Integer.valueOf(o2.replaceAll("[^0-9]",""));
                return -Integer.compare(a,b);
            }
        });
        return str;
    }
}
