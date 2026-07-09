class Solution {
    fun isValid(s: String): Boolean {

        var stack = ArrayDeque<Char>()

        val close2open = mutableMapOf(')' to '(', ']' to '[', '}' to '{')

        for (char in s) {
            if (char in close2open) {

                // if closing bracket and not first in stack
                if (stack.lastOrNull() == close2open[char]) {
                    stack.removeLast()
                } else return false
            }
            // else opening
            else {
                stack.addLast(char)
            }
        }
        return stack.isEmpty()
    }
}
