/*
 *867. Transpose Matrix
 * Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.



 

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 105
-109 <= matrix[i][j] <= 109
 */
import java.util.Arrays;

public class TransPoseMatric {
            public static void main(String[] args) {
                int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

                transposeMatrix(matrix);
            }

            static int[][] transposeMatrix(int[][] matrix) {
                int rowSize = matrix[0].length;
                int colSize = matrix.length;

                int[][] ans = new int[rowSize][colSize];
                
                for (int row=0;row<rowSize;row++){
                    for (int col =0;col<colSize;col++){
                        ans[row][col] =matrix[col][row];
                        System.err.println(ans[row][col]);
                    }
                    
                }
                System.out.println(Arrays.deepToString(ans));
                return ans;
           
            }
}
