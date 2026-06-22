class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for((index, number) in nums.withIndex()) {
            val difference: Int = target - number

            map[difference]?.let { differenceIndexValue -> 
                return intArrayOf(differenceIndexValue, index)
            }

            map[number] = index
        }

        return IntArray(2)
    }
}
