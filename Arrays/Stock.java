// You are given an array prices, where prices[i] represents the price of a given stock on the i-th day.
// You want to maximize your profit by choosing one day to buy the stock and a different day in the future to sell the stock.
// Return the maximum profit you can achieve.
// If no profit is possible, return 0.

package Arrays;
public class Stock {

    public static int stockBuySell(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum Profit: " + stockBuySell(prices));
    }
}

// Maximum Profit: 5
