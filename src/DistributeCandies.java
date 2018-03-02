import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        /*Set<Integer> diffCandies = new HashSet<>();
        for(int candy:candies)diffCandies.add(candy);
        int diffType = diffCandies.size(),length = candies.length;
        return diffType<=(length/2)?diffType:length/2;*/
        boolean[] bucket = new boolean[200001];
        int unique = 0;
        int mypart = candies.length/2;
        for (int i : candies){
            if (bucket[i + 100000] == false) {
                ++unique;
                bucket[i+100000] = true;
            }

            if(unique>mypart)
                break;
        }

        return unique > mypart ? mypart: unique;
    }
}
