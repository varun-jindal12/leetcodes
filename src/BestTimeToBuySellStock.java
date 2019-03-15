public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = -1;
        for(int i = 1 ;i<prices.length;i++){
            if(buy == -1){
                buy = prices[i];
            }
            else if(buy > prices[i]){
                buy = prices[i];
            }
            else if(prices[i] > buy){
                maxProfit += prices[i] - buy;
                buy = -1;
            }
        }
        return maxProfit;
    }
    public int maxProfit2(int[] prices){
        if(prices == null || prices.length == 0)return 0;
        int maxProfit = 0;
        int low = prices[0], high = -1;
        for(int price:prices){
            if(low > price){
                low = price;
                high = price;
            }
            else if(price > low && high <= price){
                maxProfit = Math.max(maxProfit,price - low);
                high = price;
            }
        }
        return maxProfit;
    }
}
