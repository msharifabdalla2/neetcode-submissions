class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        nums.sort()
        val resultList = mutableListOf<List<Int>>()

        for ((index, value) in nums.withIndex()) {

            if (value > 0) break

            if (index > 0 && value == nums[index - 1]) continue

            var leftPointer: Int = index + 1
            var rightPointer: Int = nums.lastIndex

            while (leftPointer < rightPointer) {
                
                var threeSum: Int = value + nums[leftPointer] + nums[rightPointer]

                when {
                    threeSum > 0 -> rightPointer--
                    threeSum < 0 -> leftPointer++
                    else -> {
                        resultList.add(mutableListOf(value, nums[leftPointer], nums[rightPointer]))

                        leftPointer++
                        rightPointer--
                        

                        while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer - 1]) leftPointer++
                    }
                }
            }
        }
        return resultList
    }
}
