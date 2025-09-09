class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = 0;
        int maxArea = 0;

        for (int i = 0; i < dimensions.length; i++) {
            for (int j = 0; j <= i; j++) {
                int a = dimensions[i][0];
                int b = dimensions[i][1];

                int diagonalSq = a * a + b * b;
                int area = a * b;

                if (diagonalSq > maxDiagonal || 
                   (diagonalSq == maxDiagonal && area > maxArea)) {
                    maxDiagonal = diagonalSq;
                    maxArea = area;
                }else{

                }
            }
        }
        return maxArea;
    }
}
