import java.util.Scanner;

class Solution {
    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] answer = new int[m][n]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[j][i] = matrix[i][j]; 
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

       
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        int[][] answer = transpose(matrix);

        
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) { 
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
