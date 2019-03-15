public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height.length == 0){
            return 0;
        }
        int maxArea = 0;
        int i = 0, j = height.length-1;
        while(i<j){
            int area = (j-i) * Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, area);
            if(height[i]>= height[j]){
                j--;
            }
            else {
                i++;
            }
        }
        return maxArea;
    }
}
