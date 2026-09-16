class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if (s.length !== t.length) return false

        val mapT = mutableMapOf<Char, Int>()
        val mapS = mutableMapOf<Char, Int>()

        for (i in s.indices) {

            mapT[s[i]] = 1 + mapT.getOrDefault(s[i], 0)
            mapS[t[i]] = 1 + mapS.getOrDefault(t[i], 0)
        }

        return mapT == mapS
    }
}
