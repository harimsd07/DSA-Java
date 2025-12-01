package recArrays;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {2,4,6,11,9};

        System.out.println(sortedOrNot(arr, 0));
    }

    static boolean  sortedOrNot(int[] arr, int  index) {
        int size = arr.length;
        
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] <arr[index+1]  && sortedOrNot(arr, index+1)){
            return true;
        
    }
        return false;
    }

   
    
}
