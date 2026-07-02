class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        val numSet: MutableSet<Int> = nums.toMutableSet()
        var maxLength: Int = 0

        for (num in numSet) {
            if ((num - 1) !in numSet) {
                var currentNum = num
                var currentStreak = 1

                while ((currentNum + 1) in numSet) {
                    currentNum++
                    currentStreak++
            }

            maxLength = maxOf(maxLength, currentStreak)
        }
    }
        return maxLength
    }
}
