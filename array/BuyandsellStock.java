public class BuyandsellStock {
    public static void main(String[] arg) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyandsellStock(prices));
    }

    public static int buyandsellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // todays profit
                maxProfit = Math.max(maxProfit, profit); // maximum of all days
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
