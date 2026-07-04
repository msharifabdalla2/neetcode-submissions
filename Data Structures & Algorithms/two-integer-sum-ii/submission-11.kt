class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        var leftPointer: Int = 0
        var rightPointer: Int = numbers.lastIndex

        while (leftPointer < rightPointer) {

            var total = numbers[leftPointer] + numbers[rightPointer]

            if (total == target) {
                
                return mutableListOf(leftPointer + 1, rightPointer + 1).toIntArray()
            } 

            else if (total < target) leftPointer++

            else if (total > target) rightPointer--
        }
        
        return mutableListOf<Int>().toIntArray()
    }
}
