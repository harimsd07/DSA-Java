import java.util.Arrays;

public class LC645 {
    public static void main(String[] args) {
        int[] nums = {3,2,2};
         
        System.out.println(Arrays.toString(subsetArray(nums)));
        
     }

    static int[] swap(int[] arr,int first, int second) {
         
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
      
        // System.out.println(Arrays.toString(arr));
        
       return arr; 
    }

    static int[] subsetArray(int[] arr){
        int i=0;
        // {1,2,2,4}
        while(i<arr.length){
            int currentPos = arr[i]-1;

            if(arr[i] != arr[currentPos]){
                swap(arr, i, currentPos);
            }else{
                i++;
            }
        }

        for( i =0;i<arr.length;i++){
            if(arr[i] != i+1){
                return new int[]{arr[i],i+1};
            }
        }
        
        return new int[]{-1,-1};
    }
}
