public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2};

        int ans = mountainArray(arr);
        System.out.println(ans);
    }

    static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int size =arr.length;
        
        
        if (size  <=1){
            return size-1;
        } 
        while(start <= end){
            int mid = start + (end - start)/2;
        if ((  mid == size-1 || arr[mid] > arr[mid +1]) ){
            end = mid -1;
        }else if(arr[mid] < arr[mid+1]){
            start = mid +1;
        }else{
            return mid;
        }
    }
        
        return start;
    }
}
