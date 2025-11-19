import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        // int[] nums ={9,6,4,2,3,5,7,0,1};
         int[] nums = {4,3,2,7,8,2,3,1};
         

        System.out.println(cyclicSort1(nums));
    }

    static int cyclicSort1(int[] arr) {
       int i=0;
       while (i<arr.length){
        int correctPos = arr[i];
        
        if(arr[i] < arr.length && arr[i] != arr[correctPos]){
            swap(arr, i, correctPos); 
        }else{
            i++;
        }
       }
        for(int j =0; j<arr.length;j++){
            if(arr[j] !=j){
                return j;
            }
        }
        return arr.length;
    }

    static int[] swap(int[] arr,int first, int second) {
         
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
      
        System.out.println(Arrays.toString(arr));
        
       return arr; 
    }
}
