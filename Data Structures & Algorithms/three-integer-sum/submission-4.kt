class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        nums.sort()
        val resultList = mutableListOf<MutableList<Int>>()

        for ((index, num) in nums.withIndex()) {

            if (num > 0) break

            if (index > 0 && num == nums[index - 1]) continue

            var lP: Int = index + 1
            var rP: Int = nums.lastIndex

            while (lP < rP) {
                var threeSum: Int = num + nums[lP] + nums[rP]

                when {
                    threeSum < 0 -> lP++
                    threeSum > 0 -> rP--
                    else -> {
                        resultList.add(mutableListOf(num, nums[lP], nums[rP]))

                        lP++

                        while (lP < rP && nums[lP] == nums[lP - 1]) lP++
                    }
                }
            }
        }
        return resultList
    }
}
