public class HouseRobber {
    public int rob(int[] nums) {
        int pn =0,py = 0,temp =0;
        for(int num :nums){
            temp = pn;
            pn = Math.max(pn,py);
            py = num + temp;
        }
        return Math.max(py,pn);
    }
}
