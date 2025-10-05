package problems.easy._0002_best_time_to_buy_and_sell_stocks_II;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int [] prices1 = {7,1,5,3,6,4};
        int [] prices2 = {1,2,3,4,5};
        int [] prices3 = {7,6,4,3,1};

        System.out.println("example 1 max profit: " + maxProfit(prices1));
        System.out.println("example 2 max profit: " + maxProfit(prices2));
        System.out.println("example 3 max profit: " + maxProfit(prices3));

    }

    public static int maxProfit(int[] prices) {
        int profit = 0;

        if  (prices == null || prices.length <= 1) {
            return 0;
        }

        int currentDay = 0;
        int nextDay = 1;
        boolean isStockBought = false;
        int boughtPrice = 0;

        while (nextDay < prices.length) {
            if (!isStockBought && prices[currentDay] < prices[nextDay]) {
                //buy if the price goes up next day and did not buy before
                boughtPrice = prices[currentDay];
                isStockBought = true;
            }

            if (isStockBought) {
                if (prices[currentDay] > prices[nextDay]) {
                    //sell if the price goes down next day
                    profit += prices[currentDay] - boughtPrice;
                    boughtPrice = 0;
                    isStockBought = false;
                } else if (nextDay == prices.length - 1) {
                    // sell if it is the last day to sell
                    profit += prices[nextDay] - boughtPrice;
                    boughtPrice = 0;
                    isStockBought = false;
                }
            }
            currentDay++;
            nextDay++;
        }

        return profit;
    }
}
