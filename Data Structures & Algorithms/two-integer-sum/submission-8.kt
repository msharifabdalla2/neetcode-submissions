class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for((index, number) in nums.withIndex()) {
            val difference: Int = target - number

            if (difference in map) {
                return intArrayOf(map[difference]!!, index)
            } else {
                map[number] = index
            }
        }

        return IntArray(2)
    }
}
