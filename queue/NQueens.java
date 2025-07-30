public class NQueens {
    public static boolean isSafe(char[][] board, int row, int col) {
        //verticle up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='q'){
                return false;
            }
        }
        
        //digleft up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='q'){
                return false;
            }
        }

        //digright up
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='q'){
                return false;
            }
        }

        return true;
    }

    public static void printboard(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void solveNQueens(char[][] board, int row) {
        if(row == board.length) {
            printboard(board);
            return;
        }
        for(int col=0; col<board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = 'q';
                solveNQueens(board, row+1);
                board[row][col] = '-';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='-';
            }
        }
        solveNQueens(board, 0);
    }
}
