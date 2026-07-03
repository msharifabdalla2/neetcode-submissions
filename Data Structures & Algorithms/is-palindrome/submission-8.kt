class Solution {
    fun isPalindrome(s: String): Boolean {

        val cleanedWord: String = s.filter { it.isLetterOrDigit() }.lowercase()

        var leftPointer: Int = 0
        var rightPointer: Int = cleanedWord.lastIndex

        while (leftPointer < rightPointer) {
            if (cleanedWord[leftPointer] != cleanedWord[rightPointer]) return false

            leftPointer++
            rightPointer--
        }

        return true
    }
}
