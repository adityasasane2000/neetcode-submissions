class Solution {

    public boolean checkRow(char[][] board, int n, int m){
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(set.contains(board[i][j])){
                    return false;
                }else if(board[i][j] != '.'){
                    set.add(board[i][j]);
                }
            }
            set.clear();
        }

        return true;
    }


    public boolean checkCol(char[][] board, int n, int m){
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(set.contains(board[j][i])){
                    return false;
                }else if(board[j][i] != '.'){
                    set.add(board[j][i]);
                }
            }
            set.clear();
        }

        return true;
    }

    public boolean checkSubGrid(char[][] board, int row, int col){
        HashSet<Character> set = new HashSet<>();
        
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(set.contains(board[i][j])){
                    return false;
                }else if(board[i][j] != '.'){
                    set.add(board[i][j]);
                }
            }
        }
        
        return true;
    }
    

    public boolean checkGrid(char[][] board, int n, int m){

        for(int i=0;i<n;i+=3){
            for(int j=0;j<m;j+=3){
                if(checkSubGrid(board,i,j) == false){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        if(checkRow(board,n,m) == false){
            return false;
        }

        if(checkCol(board,n,m) == false){
            return false;
        }

        if(checkGrid(board,n,m) == false){
            return false;
        }

        return true;

    }
}
