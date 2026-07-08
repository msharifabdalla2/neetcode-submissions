class Solution {
    fun maxArea(heights: IntArray): Int {

        var res: Int = 0

        var lP: Int = 0
        var rP: Int = heights.lastIndex

        while (lP < rP) {
            var area: Int = (rP - lP) * minOf(heights[lP], heights[rP])

            res = maxOf(res, area)

            when {
                heights[lP] < heights[rP] -> lP++
                heights[rP] < heights[lP] -> rP--
                else -> lP++
            }
        }
        return res
    }
}
