public class DoubleOfTheN {
    public static void main(String[] args) {
        int[] arr = {7,1,14,11}; //3,1,7,11  & 10,2,5,3

        boolean ans = doubleExistORNot(arr);
        System.out.println(ans);
    }

    static boolean doubleExistORNot(int[] arr) {
        
        int size = arr.length;
        if(arr.length <=1){
            return false;
        }
        for (int i =0; i<size;i++){
            for (int j =0;j<size;j++){
                if( i == j){
                    continue;
                }
                if(arr[i] == 2* arr[j]){
                    return true;
                }
               
            }
        }
        
        return false;

    }
}
