import java.util.Arrays;

public class LC41 {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(cyclicSort(nums));
        
    }
    static int cyclicSort(int[] arr) {
       int i=0;

    //    {4,3,2,7,8,2,3,1}
       while (i<arr.length){
        int correctPos = arr[i]-1;
        
        if( correctPos >=0 && correctPos <arr.length && arr[i] != arr[correctPos]){
            swap(arr, i, correctPos); 
        }else{
            i++;
        }
       }
      
        for(int j =0; j<arr.length;j++){
            if(arr[j] !=j+1){
               return j+1;
            }
        }
        return arr.length+1;
    }

     static int[] swap(int[] arr,int first, int second) {
         
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
      
        System.out.println(Arrays.toString(arr));
        
       return arr; 
    }
}
