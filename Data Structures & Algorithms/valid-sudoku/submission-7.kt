class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

        val rows = HashMap<Int, HashSet<Char>>()
        val cols = HashMap<Int, HashSet<Char>>()
        val squares = HashMap<Pair<Int, Int>, HashSet<Char>>()

        for (r in 0 until 9) {
            for (c in 0 until 9) {

                val num = board[r][c]

                if (num == '.') continue

                val rowKey = r
                val colKey = c
                val squareKey = Pair(r / 3, c / 3)


                val rowSet = rows.getOrPut(rowKey) { HashSet() }
                val colSet = cols.getOrPut(colKey) { HashSet() }
                val squareSet = squares.getOrPut(squareKey) { HashSet() }

                if (num in rowSet || num in colSet || num in squareSet) return false

                rowSet.add(num)
                colSet.add(num)
                squareSet.add(num)
            }
        }

        return true
    }
}
