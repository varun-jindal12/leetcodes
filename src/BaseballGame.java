import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {
        /*int points = 0, lastRoundPts = 0, lastToLastRoundpts = 0,curRoundpts = 0,thirdLastroundpts = 0;
        for (int i = 0; i < ops.length; ++i) {
            switch (ops[i]) {
                case "D":
                    curRoundpts = lastRoundPts * 2;
                    points += curRoundpts;
                    thirdLastroundpts = lastToLastRoundpts ;
                    lastToLastRoundpts = lastRoundPts;
                    lastRoundPts = curRoundpts;
                    continue;
                case "C":
                    points -= lastRoundPts;
                    lastRoundPts = lastToLastRoundpts;
                    lastToLastRoundpts = thirdLastroundpts;
                    continue;
                case "+":
                    curRoundpts = lastToLastRoundpts + lastRoundPts;
                    points += curRoundpts;
                    thirdLastroundpts = lastToLastRoundpts;
                    lastToLastRoundpts = lastRoundPts;
                    lastRoundPts = curRoundpts;
                    continue;
            }
            curRoundpts = Integer.parseInt(ops[i]);
            points += curRoundpts;
            thirdLastroundpts = lastToLastRoundpts;
            lastToLastRoundpts = lastRoundPts;
            lastRoundPts = curRoundpts;
        }
        return  points;*/
        List<String> points = new ArrayList<>();
        int totalPoints = 0,count = 0,lastRoundPts = 0, lastToLastRoundpts = 0,curRoundpts = 0;
        for(int i = 0 ;i< ops.length;++i){
           if(ops[i].equals("C")){
               points.remove(count-1);
               count--;
            }else {
               points.add(ops[i]);
               count++;
           }
        }
        for(int i = 0 ;i<count;++i){
            if(points.get(i).equals("D")){
                curRoundpts = lastRoundPts *2;
                totalPoints += curRoundpts;
                lastToLastRoundpts = lastRoundPts;
                lastRoundPts = curRoundpts;
            }
            else if (points.get(i).equals("+")){
                curRoundpts = lastRoundPts + lastToLastRoundpts;
                totalPoints += curRoundpts;
                lastToLastRoundpts = lastRoundPts;
                lastRoundPts = curRoundpts;
            }else {
                curRoundpts = Integer.parseInt(points.get(i));
                totalPoints += curRoundpts;
                lastToLastRoundpts = lastRoundPts;
                lastRoundPts = curRoundpts;
            }
        }
        return totalPoints;
    }
}
