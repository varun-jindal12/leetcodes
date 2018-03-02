import java.util.ArrayList;
import java.util.List;

public class VacationDays {
    public int solution(int[] A) {
        int shortestTrip = Integer.MAX_VALUE, endPos = 0;
        List<Integer> totalPlaces = new ArrayList<Integer>();
        for (int place : A) {
            if (!totalPlaces.contains(place)) {
                totalPlaces.add(place);
            }
        }
        List<Integer> dublicatPlace;
        /*for (int i = 0; i < A.length; ++i) {
            if (dublicatPlace.contains(A[i])) {
                dublicatPlace.remove(Integer.valueOf(A[i]));
                if (dublicatPlace.isEmpty()) {
                    endPos = i;
                    break;
                }
            }
        }*/
        for (int i = 0,j; i < A.length ; ++i) {
            dublicatPlace = new ArrayList<>(totalPlaces);
            for ( j = i; j < A.length; ++j) {
                if (dublicatPlace.contains(A[j])) {
                    dublicatPlace.remove(Integer.valueOf(A[j]));
                    if (dublicatPlace.isEmpty()) {
                        break;
                    }
                }
            }
            if(dublicatPlace.isEmpty() && (shortestTrip > j-i+1)){
                shortestTrip = j - i + 1;
            }
        }
        return shortestTrip;
    }
}