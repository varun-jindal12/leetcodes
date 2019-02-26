public class MaxAverageOfMArrayTree {
    public double calculateaverage(NaryNode root,double max) {
        double sum = 0;
        int count =0;
        if(root.children.size() == 0)
            return root.value;
        for(NaryNode cc : root.children){
            if(cc.children.size() > 0){
                double tmp = calculateaverage(cc,max);
                if(tmp>max){
                    max = tmp;
                }
            }
            sum+=cc.value;
            count++;
        }
        sum = sum/count;
        if(sum>max)
            max = sum;
        return max;
    }
}
