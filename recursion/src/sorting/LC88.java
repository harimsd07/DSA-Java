package sorting;

import java.util.Arrays;

public class LC88 {
    public static void main(String[] args) {
        int[] num1 = {0}; //1,2,3,0,0,0
        int[] num2 = {1};//2,5,6
        int m =0;
        int n=1;
        merge(num1, m, num2, n);
       
    }

    static void merge(int[] first,int m,int[] second,int n ) {
       
       int[] mergeArray = new int[m + n];
        int i=0;
        int j=0;
        int k =0;
        // {1,2,3,0,0,0};
        //  {2,5,6};
    while(i < first.length && j <second.length){
        
        if(first[i] == 0 || second[j] ==0){
            break;
        }
       if(first[i] < second[j]){
        mergeArray[k] = first[i];
        i++;
       }else{
        mergeArray[k] = second[j];
        j++;
       }
       k++;       
    }

     while(i < first.length && first[i] !=0){
        mergeArray[k] = first[i];
        i++;
        k++;

       }

       while(j<second.length && second[j] !=0){
        mergeArray[k] = second[j];
        j++;
        k++;
       }

       for(int l=0;l<mergeArray.length;l++){
        first[l] = mergeArray[l];
       }
       
    
}
}
