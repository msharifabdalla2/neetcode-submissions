class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        
        val hashMapS = mutableMapOf<Char, Int>()
        val hashMapT = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            hashMapS[s[i]] = hashMapS.getOrDefault(s[i], 0) + 1
            hashMapT[t[i]] = hashMapT.getOrDefault(t[i], 0) + 1
        }

        return hashMapS == hashMapT 
    }
}
