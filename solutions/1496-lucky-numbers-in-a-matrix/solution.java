class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> num = new ArrayList<>();
        for(int row = 0; row<matrix.length; row++){
            int idx = 0;
            int min = matrix[row][0];
            for(int col = 0; col<matrix[row].length;col++){
                if (min > matrix[row][col]){
                    min = matrix[row][col];
                    idx = col;
                }
            }
            boolean check = true;
            for(int i = 0;i < matrix.length;i++){
                if(matrix[i][idx] > min){
                    check = false;
                    break;
                }
            }
            if(check){
                num.add(min);
            }
        }
        
        return num;
    }
}
