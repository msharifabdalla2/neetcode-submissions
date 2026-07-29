class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = mutableMapOf<Int, Int>()

        for ((currentIndex, number) in nums.withIndex()) {
            val difference: Int = target - number

            map[difference]?.let { oldIndex ->
                return intArrayOf(oldIndex, currentIndex)
            }

            map[number] = currentIndex
        }

        return IntArray(2)
    }
}
