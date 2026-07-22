class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        var lP: Int = 0
        var maxLen: Int = 0

        val hashMap = hashMapOf<Char, Int>()

        for (rP in 0 until s.length) {
            hashMap[s[rP]] = hashMap.getOrDefault(s[rP], 0) + 1

            while (((rP - lP) + 1) - (hashMap.values.maxOrNull() ?: 0) > k) {
                hashMap[s[lP]] = (hashMap[s[lP]] ?: 0) - 1
                lP++
            }

            maxLen = maxOf((rP - lP) + 1, maxLen)
        }
        return maxLen
    }
}
