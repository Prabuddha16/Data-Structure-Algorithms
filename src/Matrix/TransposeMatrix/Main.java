package Matrix.TransposeMatrix;

public class Main {
    static void transpose(int[][] matrix, int n)
    {
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public int[][] transpose(int[][] matrix) {
        int [][] res = new int [matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                res[j][i]=matrix[i][j];
            }
        }return res;
    }
}
