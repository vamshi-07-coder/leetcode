class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] matb=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matb[j][i]=matrix[i][j];
            }
        }
        return matb;
    }
}