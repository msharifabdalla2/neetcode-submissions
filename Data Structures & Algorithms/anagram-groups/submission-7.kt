class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        
        val map = mutableMapOf<MutableList<Int>, MutableList<String>>()

        for (word in strs) {

            val wordAsciiKey = MutableList<Int>(26) { 0 }

            for (char in word) {
                wordAsciiKey[char - 'a'] += 1
            }

            var wordList = map.getOrPut(wordAsciiKey) { mutableListOf() }

            wordList.add(word)
        }

        return map.values.toList()

    }
}
