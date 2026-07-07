class Solution {
    fun maxArea(heights: IntArray): Int {
        // 1. Initiate a lP and rP and var res: Int = 0
        // 2. while (lP < rP)
            // 3. initiate var area: Int = (rP - lP) * minOf(height[lP], height[rP])
                // 3.5. res = maxOf(area, res)
                // 4. if (height[lP] < height[rP]) -> lP++
                // 5. else if (height[lP] > height[rP]) -> rP--
        // return res

        var res: Int = 0

        var lP: Int = 0
        var rP: Int = heights.lastIndex

        while (lP < rP) {
            var area: Int = (rP - lP) * minOf(heights[lP], heights[rP])

            res = maxOf(area, res)

            when {
                heights[lP] < heights[rP] -> lP++
                heights[lP] > heights[rP] -> rP--
                else -> lP++
            }
        }
        return res
    }
}
