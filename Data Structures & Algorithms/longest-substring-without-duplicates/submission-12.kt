class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        var lP: Int = 0
        val set = mutableSetOf<Char>()
        var maxLen: Int = 0

        for (rP in s.indices) {

            while (s[rP] in set) {
                set.remove(s[lP])
                lP++
            }

            set.add(s[rP])
            maxLen = maxOf(maxLen, (rP - lP) + 1)
        }
        return maxLen
    }
}


