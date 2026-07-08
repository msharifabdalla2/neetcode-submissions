class Solution {
    fun isValid(s: String): Boolean {

        var stack = ArrayDeque<Char>()
        val close2open = mutableMapOf(')' to '(', '}' to '{', ']' to '[')

        for (char in s) {
            if (char in close2open) {

                if (stack.peekLast() == close2open[char]) stack.removeLast()
                
                else return false
            }
            
            else stack.addLast(char)
        }

        return stack.isEmpty()
    }
}
