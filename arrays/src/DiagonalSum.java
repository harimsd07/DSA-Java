

/*
 * 1572. Matrix Diagonal Sum
 * Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 

Example 1:


Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
Example 3:

Input: mat = [[5]]
Output: 5
 */
public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{15,16,3,17,7,6,2},
                       {2,14,18,17,18,15,19},
                       {9,3,2,4,5,20,12},
                       {2,9,7,15,2,2,8},
                       {19,9,12,16,20,14,19},
                       {13,16,18,5,5,13,18},
                       {1,19,5,4,2,1,18}};

        diagonalSum(mat);
    }

    static int diagonalSum(int[][] mat) {
        int size = mat.length;
        int sum =0;
        int j=0 ;
        int mid = size/2;
        for (int i=0;i<size;i++){
            
            sum =sum + mat[i][j];
            j++;                
        }
            j =size-1;
         for (int i = 0;i<size;i++){
            if(size%2 !=0 && i == j) {
                sum = sum - mat[i][j];
            }  
            sum = sum + mat[i][j];
            j--;
        }

        System.out.println(sum);
        return sum;
    }
}
