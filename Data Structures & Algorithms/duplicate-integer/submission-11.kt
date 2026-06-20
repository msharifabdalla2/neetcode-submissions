class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()

        for (n in nums) {
            if (n !in set) set.add(n)
            else return true
        }

        return false

    }
}