package recArrays;

import java.util.ArrayList;

public class RecLinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,19,4,5,6,19};
        int target = 19;
        System.out.println(linearSearchIndex(arr, target, 0));

        System.out.println(linearSearchReverse(arr, target, arr.length-1));

        // System.out.println(linearSearchAllIndex(arr, target, 0));


        System.out.println(linearSearchAllIndex(arr, target, 0,new ArrayList<>()));
    }

    static boolean linearSearch(int[] arr,int target,int index){
        if(arr.length == index){
            return false;
        }
        if(arr[index] == target || linearSearch(arr, target, index+1)){
            return true;
        }
        return false;
    }

    static int linearSearchIndex(int[] arr,int target,int index){
        if(arr.length == index){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return linearSearchIndex(arr, target, index+1);
        }
        
    }


    // here a static array list is created so the values get added to the same list
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> linearSearchAllIndex(int[] arr,int target,int index){
       if(arr.length == index){
        return list;
       }
        if(arr[index] == target){
            list.add(index);
        }
            return linearSearchAllIndex(arr, target, index+1);
        
        
    }


    // here the arraylist is passed inside as an argument, 
    // so for every recursive function call new list is being created but they points to the same objects
     static ArrayList<Integer> linearSearchAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
       if(arr.length == index){
        return list;
       }
        if(arr[index] == target){
            list.add(index);
        }
            return linearSearchAllIndex(arr, target, index+1,list);
        
        
    } 

    // what if i created a new object in every recursive calls
    
    static ArrayList<Integer> linearSearchAllIndex2(int[] arr,int target,int index){
       if(arr.length == index){
        return list;
       }
        if(arr[index] == target){
            list.add(index);
        }
            ArrayList<Integer> ansFromRecurCalls = linearSearchAllIndex2(arr, target, index+1);
        
            list.addAll(ansFromRecurCalls);
            return list;
        
    } 


    static int linearSearchReverse(int[] arr,int target,int index){
        if(arr.length == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return linearSearchIndex(arr, target, index-1);
        }
        
    }
}
