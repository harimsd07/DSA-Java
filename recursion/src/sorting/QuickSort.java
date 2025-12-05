package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,20,15,6};
        sort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int lowerHalf, int higherHalf) {
        if(lowerHalf >= higherHalf){
            return;
        }
        int start = lowerHalf;
        int end = higherHalf;

        int mid  = start +(end -start)/2;
        int pivot = arr[mid];

        // {5,4,3,2,1,20,0,15,6}
        while(start <arr.length && end >=0 && start <=end){
            while(arr[start] < pivot){
                start++;
            }

            while(arr[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++ ;
                end --;
            }
        }

        sort(arr, lowerHalf, end);
        sort(arr, start, higherHalf);
    }
}
