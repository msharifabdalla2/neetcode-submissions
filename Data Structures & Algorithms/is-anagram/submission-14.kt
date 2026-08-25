class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if (s.length !== t.length) return false

        val mapS = mutableMapOf<Char, Int>()
        val mapT = mutableMapOf<Char, Int>()

        for (cha in s.indices) {
            mapS[s[cha]] = mapS.getOrDefault(s[cha], 0) + 1
            mapT[t[cha]] = mapT.getOrDefault(t[cha], 0) + 1
        }

        return mapS == mapT
    }
}
