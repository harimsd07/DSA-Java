
/*
 * 832. Flipping an Image
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 

Constraints:

n == image.length
n == image[i].length
1 <= n <= 20
images[i][j] is either 0 or 1.
 */
import java.util.Arrays;


public class FlipingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

       int[][] result =  flipImage(image);
       System.out.println(Arrays.deepToString(result));
    }

    static int[][] flipImage(int[][] image) {
        int size = image.length;
        
        int[][] ans = new int[size][size];
        int k=0;
        for (int i=0;i<size;i++){
            for (int j =image[i].length-1;j>=0;j--){
                ans[i][k] = image[i][j];
                // System.out.println(ans);
                k++;
                if(k==size){
                    k=0;
                }
            }
        }

        System.out.println(ans);
        return invertImage(ans);
    }

    static int[][] invertImage(int[][] ans) {
            int size = ans.length;
            for (int i=0;i<size;i++){
                for (int j=0;j<ans[i].length;j++){
                    
                    if(ans[i][j] == 0){
                        ans[i][j] =1;
                    }
                    else{
                        ans[i][j] =0;
                    }
                }
            }    
            System.out.println(Arrays.deepToString(ans));
            return ans;
    }
}


/*
 * optimized solution
 * 
 * import java.util.Arrays;

public class FlipingImageOptimized {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        // Call the single, optimized method
        int[][] result = flipAndInvertImage(image);
        
        System.out.println(Arrays.deepToString(result));
        // Output: [[1, 0, 0], [0, 1, 0], [1, 1, 1]]
    }

   
     * An optimized method to flip and invert the image in-place.
     * Time Complexity: O(N * M) where N is rows and M is columns.
     * Space Complexity: O(1) as we modify the input array directly.
     
    static int[][] flipAndInvertImage(int[][] image) {
        // Iterate through each row in the image
        for (int[] row : image) {
            int start = 0; // Pointer at the beginning of the row
            int end = row.length - 1; // Pointer at the end of the row

            // Loop until the pointers meet or cross
            while (start <= end) {
                // 1. Get the value at the start and invert it
                //    We use the XOR (^) operator: 1 ^ 1 = 0 and 0 ^ 1 = 1
                int invertedStart = row[start] ^ 1;
                
                // 2. Get the value at the end and invert it
                int invertedEnd = row[end] ^ 1;

                // 3. Swap the inverted values
                row[start] = invertedEnd;
                row[end] = invertedStart;

                // 4. Move the pointers inward
                start++;
                end--;
            }
        }
        
        // Return the modified original array
        return image;
    }
}
 * 
 */