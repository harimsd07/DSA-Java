import java.util.Arrays;

public class Sorting {
    public static void main(String[] args)  {
       int[] arr = {5,3,1,4,-2}; 

      int[] ans=  insertionSort(arr);
      System.out.println(Arrays.toString(ans));
    }


// ***Insertion Sort ***

    static  int[] insertionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] <arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
        return arr;
    }

// *** Selection Sort ***
    static int[] selectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int last = arr.length-1;
            
       int minValue = findMin(arr,i,last);
       swap(arr, minValue, i);
       System.out.println(Arrays.toString(arr));

        }
       
        return arr;
    }

    static int findMin( int[] arr,int start,int end){
        int minValue = start;
            // {5,3,1,4,2}
        for (int i=start;i<=end;i++){
            if(arr[i] < arr[minValue]){
                minValue = i;
            }
        }
        return minValue;
    }


// *** Bubble Sort ***
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
      
        System.out.println(Arrays.toString(arr));
        
       return arr; 
    }
    
}
