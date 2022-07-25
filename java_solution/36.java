class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][] boxes = new int[9][9];

        for(int i = 0; i< 9; i++){
            for(int j = 0; j<9; j++){

                if(board[i][j] == '.'){
                    continue;
                }
                
                int curnum = board[i][j]-'1';
                if(rows[i][curnum] == 1){
                    return false;
                }
                if(columns[j][curnum] == 1){
                    return false;
                }
                if(boxes[j/3 + (i/3)*3][curnum] == 1){
                    return false;
                }
                
                rows[i][curnum] = 1;
                columns[j][curnum] = 1;
                boxes[j/3 + (i/3)*3][curnum] = 1;

            }
        }
        return true;

    }
}