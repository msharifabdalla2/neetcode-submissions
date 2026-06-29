class Solution {

    fun encode(strs: List<String>): String {
        val str = StringBuilder()

        for (word in strs) {
            str.append(word.length)
            str.append("#")
            str.append(word)
        }

        return str.toString()
    }

    fun decode(str: String): List<String> {
        val resultList = mutableListOf<String>()

        var i: Int = 0

        while (i < str.length) {
            var j: Int = i

            while (str[j] != '#') {
                j++
            }

            val length = str.substring(i, j).toInt()

            i = j + 1

            val word : String = str.substring(i, i + length)

            resultList.add(word)

            i += length
        }

        return resultList
    }
}
