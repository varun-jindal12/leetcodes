import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InactiveAndActiveCells {
    public List<Integer> inactiveAndActiveCells (int []states, int days){
        int length = states.length;
        int temp[] = new int[length];
        for(int i = 0; i<states.length;++i){
            temp[i] = states[i];
        }

        while(days > 0){
            temp[0] = states[1];
            temp[length-1] = states[length-2];

            for(int i = 1;i<=length-2;i++){
                temp[i] = (states[i-1] + states[i+1]) % 2;
            }
            for(int i = 0;i<length;i++){
                states[i] = temp[i];
            }
            days--;
        }
        List<Integer> statesAfterKDays = Arrays.stream( states ).boxed().collect( Collectors.toList() );

        return statesAfterKDays;
    }
}
