class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {

        val n1: Int = s1.length
        val n2: Int = s2.length

        if (n1 > n2) return false

        val count1 = MutableList(26) { 0 }
        val count2 = MutableList(26) { 0 }

        for (i in 0 until n1) {
            count1[s1[i] - 'a']++
            count2[s2[i] - 'a']++
        }

        if (count1 == count2) return true

        for (i in n1 until n2) {
            count2[s2[i] - 'a']++
            count2[s2[i - n1] - 'a']--
            if (count1 == count2) return true
        }

        return false
    }
}
