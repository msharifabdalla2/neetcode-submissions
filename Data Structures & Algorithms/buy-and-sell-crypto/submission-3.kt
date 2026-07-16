class Solution {
    fun maxProfit(prices: IntArray): Int {

        var lP: Int = 0
        var rP: Int = 1
        var maxProfit: Int = 0

        while (rP < prices.size) {
            if (prices[lP] < prices [rP]) {
                val profit: Int = prices[rP] - prices[lP]
                maxProfit = maxOf(profit, maxProfit)
            }
            else lP = rP

            rP++
        }
        return maxProfit
    }
}
