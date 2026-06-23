class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for ((index, number) in nums.withIndex()) {
            val difference = target - number

            map[difference]?.let { oldIndex -> 
                return intArrayOf(oldIndex, index)
            }

            map[number] = index
        }

        return IntArray(2)
    }
}
