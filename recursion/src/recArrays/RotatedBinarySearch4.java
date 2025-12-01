package recArrays;

public class RotatedBinarySearch4 {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        // int[] arr = {5,6,1,2,3,4};
        int target = 2;
        System.out.println(rBS(arr, target, 0, arr.length-1));
    }

    static int rBS(int[] arr,int target,int start,int end){
        // {5,6,7,8,9,1,2,3}
        //  { 5,6,1,2,3,4}
        if(start >end ){
            return -1;
        }

        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] >= arr[start]){
            if(target >= arr[start] && target <= arr[mid]){
                return rBS(arr, target, start, mid-1);
            }else{
                return rBS(arr, target, mid+1, end);
            }
        }

        if(arr[mid] <= arr[start]){
            if(target >= arr[mid] && target <= arr[start]){
                return rBS(arr, target, mid+1, end);
            }else{
                return rBS(arr, target, start, mid-1);
            }
        }
        return -1;
    }
}
