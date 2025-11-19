import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2,0};
       System.out.println(Arrays.toString(cyclicSort1(arr)));
    }

    static int[] cyclicSort(int[] arr) {
        for (int i =0;i<arr.length;i++){
            if( i != arr[i]){
                int valueAtI = searching(arr,i);
                swap(arr, i, valueAtI);
            }else{
                break;
            }
        }   
        return arr; 
    }

    static int[] cyclicSort1(int[] arr) {
       int i=0;
       while (i<arr.length){
        int correctPos = arr[i];
        if(arr[i] != arr[correctPos]){
            swap(arr, i, correctPos); 
        }else{
            i++;
        }
       }
        return arr; 
    }

    static int searching(int[] arr, int target) {
       for(int i=0;i<arr.length;i++){
        if(arr[i] ==target){
            return i;
        }
       }
        return -1;
    }

    static int[] swap(int[] arr,int first, int second) {
         
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
      
        System.out.println(Arrays.toString(arr));
        
       return arr; 
    }
}
