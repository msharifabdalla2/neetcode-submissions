class Solution {
    fun evalRPN(tokens: Array<String>): Int {

        val stack = ArrayDeque<Int>()

        for (token in tokens) {
            when (token) {
                "+" -> {
                    val pop1 = stack.removeLast()
                    val pop2 = stack.removeLast()
                    stack.addLast(pop2 + pop1)
                }
                "-" -> {
                    val pop1 = stack.removeLast()
                    val pop2 = stack.removeLast()
                    stack.addLast(pop2 - pop1)
                }
                "/" -> {
                    val pop1 = stack.removeLast()
                    val pop2 = stack.removeLast()
                    stack.addLast(pop2 / pop1)
                }
                "*" -> {
                    val pop1 = stack.removeLast()
                    val pop2 = stack.removeLast()
                    stack.addLast(pop2 * pop1)
                }
                else -> {
                    stack.addLast(token.toInt())
                }
            }
        }
        return stack.last()
    }
}
