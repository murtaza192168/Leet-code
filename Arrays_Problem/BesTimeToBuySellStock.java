public class BesTimeToBuySellStock {

    //  I am not going to use params-constructor here because I will be declaring the method as STATIC
    // As usual defualt-constructor will be created and called implicitly

    /* method to find the - lowest price to buy the stock,
                          - highest price to sell the stock,
                          - Profit of these for the track,
                          - Taking out the Max profit by comparing
                          - OuPut: Return Maximum Profit when you sell the stock
    */
    public static int findMaximumProfit(int[] stock_rates){
        // FYI, the rates mentioned in the array denotes that the i is the price on the ith day
        int minRate = Integer.MAX_VALUE; // considering the max-value initially to compare and get the minimum price to buy the stock
        int maxProfit = 0; // maximum profit is going to be zero for now, since we havent started buying the stock, so how come we shall consider some other figure for the maxProfit....(Common sense)
        // stock_rates=[10,4,6,8,1];
        for(int i=0; i<=stock_rates.length-1; i++){ // We are going to Rely on the looping system to get our results
            if(stock_rates[i] < minRate){
                minRate = stock_rates[i];
            }
            // calculate profit for each Iteration
            int profit = stock_rates[i] - minRate;
            // compare each profit with the max profit and return the max profit once all the prices are being compared
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
