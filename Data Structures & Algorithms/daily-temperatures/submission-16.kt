class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val res = IntArray(temperatures.size)

        for ((currIndex, currTemp) in temperatures.withIndex()) {

            while (stack.isNotEmpty() && currTemp > temperatures[stack.peekLast()]) {
                var prevIndex = stack.removeLast()
                res[prevIndex] = (currIndex - prevIndex)
            }
            stack.addLast(currIndex)
        }
        return res
    }
}
