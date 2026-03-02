
public class MaxSubarray_LC53 {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int max =0;
        for (int i=0;i<prices.length;i++) {
            if (prices[i]<buy) buy = prices[i];
            else if (prices[i]-buy > max) max = prices[i]-buy;
        }
        return max; 
    }
}
