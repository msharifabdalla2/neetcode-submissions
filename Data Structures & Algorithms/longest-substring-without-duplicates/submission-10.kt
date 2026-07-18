class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        var lP = 0
        var set = mutableSetOf<Char>()
        var maxLen = 0

        for (rP in 0 until s.length) {
            
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
