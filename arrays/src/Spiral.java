
import java.util.Arrays;
import java.util.List;

public class Spiral {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        spiral(matrix);
    }

    static List<Integer> spiral(int[][] matrix) {
        int size = matrix[0].length;
        
        int row =0;
        int rowLength =3;
        int col =0;
        int k =0;

        
        Integer[] ans = new Integer[rowLength*size];

        if(matrix.length ==1){
            
                ans[k] =matrix[row][col];
        
        }

        if (row == 0 && col ==0){
            row =0;
            for (col =0;col<size;col++){
                ans[k] = matrix[row][col];
                k++;
                if(k == size){
                    k= size;
                }
            }
        }

        System.out.println(Arrays.toString(ans));
        System.out.println("row: " +row +" "+ "col: " + col+ " " + "k: " +k);

        if (row == 0 && col == size  ){
            col = size-1;
            for (row = row+1;row<rowLength;row++){
                ans[k] = matrix[row][col];
                k++;
            }
        }

        System.out.println(Arrays.toString(ans));
        System.out.println("row: " +row +" "+ "col: " + col+ " " + "k: " +k);

        if (row ==rowLength && col == size-1){
            row = rowLength-1;
            for (col = (size-1)-1;col>=0;col--){
                ans[k] =matrix[row][col];
                k++;
            }
            if(col <0){
                col =0;
            }
        }

        System.out.println(Arrays.toString(ans));
        System.out.println("row: " +row +" "+ "col: " + col+ " " + "k: " +k);

        if (row == rowLength-1 && col ==0){
            col =0;
            for (row =row-1;row >0;row--){
                ans[k] = matrix[row][col];
                k++;   
                
            }

            System.out.println(Arrays.toString(ans));
             System.out.println("row: " +row +" "+ "col: " + col+ " " + "k: " +k);

            if (row ==0 && col == 0){
                row = row+1;
                for (col = col+1;col<size-1;col++){
                    ans[k] = matrix[row][col];
                    k++;

                    if (k == rowLength*size){
                         System.out.println("row: " +row +" "+ "col: " + col+ " " + "k: " +k);

                            System.out.println(Arrays.toString(ans));

                            
                    }
                }
            }
        }
        System.out.println(Arrays.toString(ans));
                            List<Integer> list = Arrays.asList(ans);

                            System.out.println(list);
        
       return list;
    }  
    }

