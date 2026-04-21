class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<String, Set<Character>> squares = new HashMap<>();
        Set<Character>[] c = new HashSet[9];
        for (int l = 0;l < 9;l++){
            c[l] = new HashSet<Character>();
        }
        for(int i = 0;i < board.length;i++) {
            HashSet<Character> r = new HashSet<>();
            char[] row = board[i];
            for (int j = 0;j < row.length;j++) {
                if (row[j] == '.'){
                    continue;
                }
                if(r.contains(row[j])) {
                    return false;
                }
                r.add(row[j]);
                if(c[j].contains(row[j])) {
                    return false;
                }
                c[j].add(row[j]);
                String squareKey = (i / 3) + "," + (j / 3);
                if (squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[i][j])) {
                    return false;
                }
                squares.get(squareKey).add(board[i][j]);
            }
        }
        return true;
    }
}
