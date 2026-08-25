class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = mutableMapOf<Int, Int>()

        for ((currentIndex, number) in nums.withIndex()) {
            val difference = target - number

            if (difference in map) {
                return intArrayOf(map[difference] ?: 0, currentIndex)
            }

            map[number] = currentIndex
        }

        return IntArray(2)
    }
}
