class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res =  new ArrayList<>();
        char[][] chess = new char[n][n];
        
        for(int i=0; i<n; i++){
            Arrays.fill(chess[i], '.');
        }

        backTrack(0, chess, res, n);
        return res;
    }
    private static void backTrack(int col, char[][] chess, List<List<String>> res, int n){
        if(col == n){
            res.add(construct(chess));
            return;
        }

        for(int row = 0; row < n; row++){
            if(isValid(chess, row, col, n)){
                chess[row][col] = 'Q';
                backTrack(col+1, chess, res, n);
                chess[row][col] = '.';
            }
        }
    }

    public static boolean isValid(char[][] chess, int row, int col, int n){
        for(int i=0; i<col; i++){
            if(chess[row][i] == 'Q') return false;
        }
        for(int i=1; row-i >=0 && col-i >= 0; i++){ //upper left diagonal
                if(chess[row-i][col-i] == 'Q') return false;
        }
        for(int i=1; row+i < n && col-i >= 0; i++){// lower left diagonal
                if(chess[row+i][col-i] == 'Q') return false;
        }
            
        
        return true;
    }

    private static List<String> construct(char[][] chess){
        List<String> ans = new ArrayList<>();
        for(char[] val : chess){
            ans.add(new String(val));
        }
        return ans;
    }
}
