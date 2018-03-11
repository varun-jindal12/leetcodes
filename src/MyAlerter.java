public class MyAlerter {
    public boolean alertMe(int [] runs, int windowSize,double threshold){

        int occurence = 0,max = 0,prevMax = 0;
        double currAvg = 0, prevAvg = 0;
        for(int i = 0; i < runs.length;++i){
            currAvg = 0;
//            int winSize = i + windowSize >= runs.length?runs.length:i+windowSize;
            if(i + windowSize>runs.length)break;
            int winSize = i + windowSize;
            for(int j = i;j<winSize;++j){
                currAvg += runs[j];
                if(runs[j] > max){
                    max = runs[j];
                }
            }
            currAvg /= windowSize;
            if(prevAvg != 0f && prevAvg*threshold<= currAvg)return true;
            if(max >threshold*currAvg && max == prevMax){
                occurence++;
                if(occurence == windowSize) return true;
            }
            else if(max > threshold*currAvg){
                occurence = 1;
                prevMax = max;
                continue;
            }
            else{
                occurence = 0;
            }
            prevAvg = currAvg;
        }
        return false;
    }
}
