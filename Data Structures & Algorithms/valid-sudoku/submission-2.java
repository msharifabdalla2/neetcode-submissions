class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char current = board[r][c];

                if (current == '.') continue;

                String squareKey = (r / 3) + "," + (c / 3);

                if(!rows.containsKey(r)) rows.put(r, new HashSet<>());
                if(!columns.containsKey(c)) columns.put(c, new HashSet<>());
                if(!squares.containsKey(squareKey)) squares.put(squareKey, new HashSet<>());

                if (rows.get(r).contains(current) || 
                    columns.get(c).contains(current) || 
                    squares.get(squareKey).contains(current)) {
                    return false;
                }

                rows.get(r).add(current);
                columns.get(c).add(current);
                squares.get(squareKey).add(current);
            }
        }

        return true;

    }
}
