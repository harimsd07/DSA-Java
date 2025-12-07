

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        checkIndex(arr);
        // System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    static List checkIndex(int[] arr){

        List<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            int correctPos = arr[i]-1;

            if(arr[i] != arr[correctPos]){
                list.add(i);
            }
        }
        System.out.println(list.toString());
        return list;
    }
}