class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        val resultArray = MutableList<Int>(nums.size) { 0 }

        var preFix: Int = 1
        var postFix: Int = 1

        for (i in nums.indices) {
            resultArray[i] = preFix

            preFix *= nums[i]
        }

        for (i in nums.indices.last downTo 0) {
            resultArray[i] *= postFix

            postFix *= nums[i]
        }

        return resultArray.toIntArray()
    }
}
