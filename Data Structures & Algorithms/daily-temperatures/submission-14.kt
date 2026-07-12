class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        // Stack stores indices of the temperatures array
        val stack = ArrayDeque<Int>()
        val res = IntArray(temperatures.size)

        for (currentIndex in temperatures.indices) {
            val currentTemp = temperatures[currentIndex]
            
            // Look at the top of the stack (first element)
            while (stack.isNotEmpty() && currentTemp > temperatures[stack.first()]) {
                val prevIndex = stack.removeFirst()
                res[prevIndex] = currentIndex - prevIndex
            }
            
            // Push current index onto the top of the stack
            stack.addFirst(currentIndex)
        }
        return res
    }
}
