import java.util.*;

public class DnaDistance {
    public int minMutation(String start, String end, String[] bank) {
        /*if(start.equals(end)) return 0;

        Set<String> bankSet = new HashSet<>();
        for(String b: bank) bankSet.add(b);

        char[] charSet = new char[]{'A', 'C', 'G', 'T'};

        int level = 0;
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);

        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                String curr = queue.poll();
                if(curr.equals(end)) return level;

                char[] currArray = curr.toCharArray();
                for(int i = 0; i < currArray.length; i++) {
                    char old = currArray[i];
                    for(char c: charSet) {
                        currArray[i] = c;
                        String next = new String(currArray);
                        if(!visited.contains(next) && bankSet.contains(next)) {
                            visited.add(next);
                            queue.offer(next);
                        }
                    }
                    currArray[i] = old;
                }
            }
            level++;
        }
        return -1;*/
        if(start.equals(end)){
            return 0;
        }
        char mutationSet[] = {'A','C','G','T'};
        Set<String> bankData = new HashSet<>();
        for(String data:bank){
            bankData.add(data);
        }
        Set<String> mutationDone = new HashSet<>();
        Queue<String> possibleMutation = new LinkedList<>();
        possibleMutation.offer(start);
        mutationDone.add(start);
        int mutationCount = 0;

        while(!possibleMutation.isEmpty()){
            int length = possibleMutation.size();
            while(length > 0){
                String curMutation = possibleMutation.poll();
                if (curMutation.equals(end)) return mutationCount;
                char curMutationArray[] = curMutation.toCharArray();
                int curLength = curMutationArray.length;
                for(int i = 0 ;i<curLength;++i){
                    char original = curMutationArray[i];
                    for(char character:mutationSet){
                        curMutationArray[i] = character;
                        String test = new String(curMutationArray);
                        if(!mutationDone.contains(test) && bankData.contains(test)){
                            mutationDone.add(test);
                            possibleMutation.offer(test);
                        }
                    }
                    curMutationArray[i] = original;
                }
                length--;
            }
            mutationCount++;
        }
        return -1;
    }
}
