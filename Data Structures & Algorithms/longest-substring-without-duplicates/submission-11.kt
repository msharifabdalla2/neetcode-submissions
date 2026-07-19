class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        var lP: Int = 0
        val stack = mutableSetOf<Char>()
        var maxLen: Int = 0

        for (rP in s.indices) {

            while (stack.isNotEmpty() && s[rP] in stack) {
                stack.remove(s[lP])
                lP++
            }

            stack.add(s[rP])
            maxLen = maxOf(maxLen, (rP - lP) + 1)
        }
        
        return maxLen
    }
}
