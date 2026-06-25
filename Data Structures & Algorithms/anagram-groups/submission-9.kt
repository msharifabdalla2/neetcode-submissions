class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<MutableList<Int>, MutableList<String>>()

        for (word in strs) {
            val listKey = MutableList<Int>(26) {0}

            for (char in word) {
                listKey[char - 'a']++
            }

            var wordList = map.getOrPut(listKey) { mutableListOf() }

            wordList.add(word)
        }

        return map.values.toMutableList()
    
    }

}
