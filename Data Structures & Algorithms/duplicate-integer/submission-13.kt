class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val set = mutableSetOf<Int>()

        for (num in nums) {

            if (num in set) return true

            else set.add(num)
        }

        return false
    }
}
