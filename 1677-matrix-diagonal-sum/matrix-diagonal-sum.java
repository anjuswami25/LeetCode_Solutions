class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length; // number of rows (and columns)

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum += mat[i][i];

            // Secondary diagonal (avoid double counting the center)
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        return sum;
    }
}
