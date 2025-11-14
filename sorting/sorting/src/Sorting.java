import java.util.Arrays;

public class Sorting {
    public static void main(String[] args)  {
       int[] arr = {-5,3,-11,4,2}; 

      int[] ans=  bubbleSort(arr);
      System.out.println(Arrays.toString(ans));
    }

    static int[] bubbleSort(int arr[]){
       
        int pass = arr.length;
        for (int i=0;i<pass;i++){
            for (int j=1;j<pass;j++){
                if(arr[j] <arr[j-1]){
                    swap(arr,j,j-1);
                    // System.out.println(Arrays.toString(arr));
                    
                }
                
            }
        }
          return arr;
    }

    static int[] swap(int[] arr,int first, int second) {
         
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
      
        // System.out.println(Arrays.toString(arr));
        
       return arr; 
    }
    
}
