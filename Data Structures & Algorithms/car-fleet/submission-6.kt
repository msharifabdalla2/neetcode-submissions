class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {

        val stack = ArrayDeque<Double>()

        val combined = Array(position.size) { i -> Pair(position[i], speed[i])}

        val sortedComb = combined.sortedBy { it.first }

        for (car in sortedComb.reversed()) {
            val time: Double = (target - (car.first)).toDouble() / (car.second).toDouble()

            if (stack.isNotEmpty() && time <= stack.last()) continue

            else stack.addLast(time)
        }
        return stack.size
    }
}
