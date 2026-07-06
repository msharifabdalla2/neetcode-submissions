class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        var leftPointer: Int = 0
        var rightPointer: Int = numbers.lastIndex

        while (leftPointer < rightPointer) {

            var total: Int = numbers[leftPointer] + numbers[rightPointer]

            when {
                total == target -> return intArrayOf(leftPointer +1, rightPointer + 1)
                total < target -> leftPointer++
                else -> rightPointer--
            }
        }

        return intArrayOf()
    }
}
