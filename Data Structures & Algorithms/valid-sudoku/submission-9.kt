class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

        val rows = mutableMapOf<Int, MutableSet<Char>>()
        val cols = mutableMapOf<Int, MutableSet<Char>>()
        val square = mutableMapOf<Pair<Int, Int>, MutableSet<Char>>()

        for (r in 0 until 9) {
            for (c in 0 until 9) {

                val num = board[r][c]

                if (num == '.') continue

                val rowSet = rows.getOrPut(r) { mutableSetOf() }
                val colSet = cols.getOrPut(c) { mutableSetOf() }
                val squareSet = square.getOrPut(Pair(r / 3, c / 3)) { mutableSetOf() }

                if (num in rowSet || num in colSet || num in squareSet) return false

                rowSet.add(num)
                colSet.add(num)
                squareSet.add(num)
            }
        }

        return true
    }
}
