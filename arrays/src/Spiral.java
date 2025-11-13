
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20},{21,22,23,24}};
            // int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
            // int [][] matrix = {{1,2},{3,4}};
        // spiral(matrix);
        inspiredSpireal(matrix);
    }

    static List<Integer> spiral(int[][] matrix) {
        
        int row =0 ;
        int col =0;
        int colSize = matrix[0].length;
        int rowSize =matrix.length;

        ArrayList<Integer> ans = new ArrayList<>();
            
            if (row ==0){
                for (col =0 ;col <colSize;col++){

                    ans.add(matrix[row][col]);
                }
            }
            System.out.println(ans);
            row++;
            col =colSize-1;
            if (col ==colSize-1 && row >0){
                while(row<rowSize){
                    ans.add(matrix[row][col]);
                    row++;
                }
            }
            System.out.println(ans);
            row = rowSize-1;
            col--;
            if(row == rowSize-1 && row>0 && col<colSize && col>=0){
                while(col>=0){
                    ans.add(matrix[row][col]);
                    col--;
                }
            }
            System.out.println(ans);
            col = 0;
            row--;
            if(row<rowSize-1 && col == 0 && row>=0){
                while(row>0 && row <rowSize && col <colSize-1){
                    ans.add(matrix[row][col]);
                    col++;
                } 
            }
            System.out.println(ans);

        return ans;
    }  

    static List<Integer> inspiredSpireal(int[][] matrix){
        int row =0 ;
        int col =0;
        int colSize = matrix[0].length;
        int rowSize = matrix.length;

        ArrayList<Integer> ans = new ArrayList<>();

        while(row <= rowSize-1 && col <= colSize-1){
            for (int i =col ;i <colSize;i++){

                    ans.add(matrix[row][i]);
                }
                System.out.println(ans);
                row ++;

                for (int i = row;i<rowSize;i++ ){
                    col = colSize-1;
                    ans.add(matrix[i][col]);
                }
                System.out.println(ans);
                col --;

                for(int i= col;i>=0;i--){
                    row = rowSize-1;
                    ans.add(matrix[row][i]);
                }
                System.out.println(ans);

                row--;

                for (int i=0;i<colSize-1;i++){
                    
                    ans.add(matrix[row][i]);
                }
                System.out.println(ans);
        }

        System.out.println(ans);
        return null;
    }
    }


    