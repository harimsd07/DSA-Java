import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] nums ={1,2,0};
        //  int[] nums = {4,3,2,7,8,2,3,1};
         
        // System.out.println(Arrays.toString(cyclicSort2(nums)));
        System.out.println( cyclicSort2(nums));
    }

    static List<Integer> cyclicSort1(int[] arr) {
       int i=0;

    //    {4,3,2,7,8,2,3,1}
       while (i<arr.length){
        int correctPos = arr[i]-1;
        
        if( arr[i] != arr[correctPos]){
            swap(arr, i, correctPos); 
        }else{
            i++;
        }
       }
       ArrayList ans = new ArrayList<>();

        for(int j =0; j<arr.length;j++){
            if(arr[j] !=j+1){
                ans.add(arr[j]) ;
            }
        }
        //  int[] solution = ans.stream().mapToInt(i -> i).toArray();

        // int [] solution = new int[ans.size()];
        // solution = ans.toArray(a)
        //  System.out.println(Arrays.toString(solution));
        return ans;
    }

     static int cyclicSort2(int[] arr) {
       int i=0;

    //    {4,3,2,7,8,2,3,1}
       while (i<arr.length){
        int correctPos = arr[i]-1;
        
        if( arr[i] != arr[correctPos]){
            swap(arr, i, correctPos); 
        }else{
            i++;
        }
       }
      
        for(int j =0; j<arr.length;j++){
            if(arr[j] !=j+1){
               return arr[j];
            }
        }
        return -1;
    }

    static int[] cyclicSort3(int[] arr) {
       int i=0;

    //    {1,2,2,4}
       while (i<arr.length){
        int correctPos = arr[i]-1;
        
        if( arr[i] != arr[correctPos]){
            swap(arr, i, correctPos); 
        }else{
            i++;
        }
       }
          ArrayList ans = new ArrayList<>();

        for(int j =0; j<arr.length;j++){
            if(arr[j] !=j+1){
               return new int[] {j,j+1};

            }
        }
    //    int[] solution = new int[ans.size()]; 

    //    for(i=0;i<ans.size();i++){
    //         solution[i] = (int) ans.get(i);
    //    }
    //    System.out.println(Arrays.toString(solution));
        return new int[]{-1,-1};
    }

    static int[] swap(int[] arr,int first, int second) {
         
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
      
        System.out.println(Arrays.toString(arr));
        
       return arr; 
    }
}
