class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<MutableList<Int>, MutableList<String>>()

        for (word in strs) {
            val listKey = MutableList<Int>(26) {0}

            for (char in word) {
                listKey[char - 'a']++
            }

            // map[listKey] = map.getOrDefault(listKey, mutableListOf())

            map.getOrPut(listKey) { mutableListOf() }.add(word)
        }

        return map.values.toMutableList()
    
    }

}
