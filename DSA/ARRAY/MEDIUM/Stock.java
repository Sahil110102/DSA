public class Stock {
    public static int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxProfit  = 0;

        for(int i=0; i<prices.length ; i++){
            int cost = prices [i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices [] = {7, 1, 5, 3, 6, 4};
        
        int maxPro = maxProfit(prices);
        System.out.println("The Maximun Profit Gained = "+ maxPro);


    
    }
}
