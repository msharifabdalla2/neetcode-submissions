class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_p = 0
        l, r = 0, 1

        while r < len(prices):
            if prices[l] < prices[r]:
                profit = prices[r] - prices[l]
                max_p = max(profit, max_p)
            elif prices[r] <= prices[l]:
                l = r
            r += 1
        return max_p
                    