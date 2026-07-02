class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

        val rows = HashMap<Int, HashSet<Char>>()
        val cols = HashMap<Int, HashSet<Char>>()
        val square = HashMap<Pair<Int, Int>, HashSet<Char>>()

        for (r in 0 until 9) {
            for (c in 0 until 9) {

                val num = board[r][c]

                if (num == '.') continue

                val rowSet = rows.getOrPut(r) { hashSetOf() }
                val colSet = cols.getOrPut(c) { hashSetOf() }
                val squareSet = square.getOrPut(Pair(r / 3, c / 3)) { hashSetOf() }

                if (num in rowSet || num in colSet || num in squareSet) return false

                rowSet.add(num)
                colSet.add(num)
                squareSet.add(num)
            }
        }

        return true
    }
}
