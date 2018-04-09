import java.util.HashMap;
import java.util.Map;

public class RectanglarArea {
    public int[] constructRectangle(int area) {
        /*int result[] = new int[2];
        int breadth = (int)Math.floor(Math.sqrt(area)), length = (int)Math.ceil(Math.sqrt(area));
        if(breadth*length == area){
            result[0] = breadth;
            result[1] = length;
            return  result;
        }
        while(breadth >=1 && length<=area){
            breadth--;
            length++;
            if(breadth*length == area){
                result[0] = breadth;
                result[1] = length;
                return result;
            }
        }
        result[0] = 1;
        result[1] = area;
        return result;*/
        /*Map<Integer,Integer> factors = new HashMap<>();
        int minDiff = area, result[] = new int[2];
        for(int i = 1; i <= area; ++i){
            if(area % i == 0){
                factors.put(i,area/i);
            }
        }
        for(Map.Entry<Integer, Integer> factorPair: factors.entrySet()){
            int breadth = factorPair.getKey(),length = factorPair.getValue();
            if(minDiff > Math.abs(breadth-length)){
                minDiff = Math.abs(breadth-length);
                result[0] = breadth<length?length:breadth;
                result[1] = breadth + length - result[0];
            }
        }
        return result;*/

        int result[] = new int[2];
        int centre = (int) Math.sqrt(area);
        while(area % centre != 0){
            centre--;
        }
        result[0] = area/centre;
        result[1] = centre;
        return result;
    }
}
