class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int row = 0; row<mat.length ; row++){
            for(int col = 0; col<mat[row].length; col++){
                int rowEnd = mat.length - row - 1;
                int colEnd = mat[row].length - col - 1;
                if (row == col){
                    sum = sum + mat[row][col];
                }else if (row == colEnd){
                    sum = sum + mat[row][col];
                }else if (rowEnd == col){
                    sum = sum + mat[row][col];
                }
                else if (rowEnd == colEnd){
                    sum = sum + mat[row][col];
                }
            }

        }
        return sum;
    }
}
