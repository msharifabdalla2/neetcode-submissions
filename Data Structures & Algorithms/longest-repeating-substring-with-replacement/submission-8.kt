class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        var lP: Int = 0
        val map = hashMapOf<Char, Int>()
        var maxLen: Int = 0

        for (rP in s.indices) {
            map[s[rP]] = map.getOrDefault(s[rP], 0) + 1

            while (((rP - lP) + 1) - (map.values.maxOrNull() ?: 0) > k) {
                map[s[lP]] = map[s[lP]]!! - 1
                lP++
            }

            maxLen = maxOf(maxLen, (rP - lP) + 1)
        }
        return maxLen
    }
}
