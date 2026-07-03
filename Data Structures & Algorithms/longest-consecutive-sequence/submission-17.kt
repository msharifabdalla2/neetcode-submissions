class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        val numSet: MutableSet<Int> = nums.toMutableSet()
        var maxSequence: Int = 0

        for(num in numSet) {
            if((num - 1) !in numSet) {
                var currentNum: Int = num
                var currentStreak: Int = 1

                while((currentNum + 1) in numSet) {
                    currentNum++
                    currentStreak++
                }

                maxSequence = maxOf(maxSequence, currentStreak)
            }
        }

        return maxSequence
    }
}
