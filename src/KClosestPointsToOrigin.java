import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KClosestPointsToOrigin {
    public List<List<Integer>> kClosest(int dest, List<List<Integer>> points, int deliveries) {
        int pointCount = points.size();
        List<Integer> dists = new ArrayList<>();
        for(int i = 0; i<pointCount;i++){
            dists.add(dist(points.get(i)));
        }

        Collections.sort(dists);
        int maxDist = dists.get(deliveries-1);
        List<List<Integer>> kClosestPoints = new ArrayList<>();
        for(int i = 0;i<pointCount && kClosestPoints.size() <deliveries;i++){
            if(dist(points.get(i)) <= maxDist){
                kClosestPoints.add(points.get(i));
                //if(kClosestPoints.size() == deliveries) break;
            }
        }
        return kClosestPoints;
    }

    public int dist(List<Integer> point) {
        return point.get(0) * point.get(0) + point.get(1) * point.get(1);
    }
}
