import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        //int[] digits = {9,9,9,9,9};

        plusOne(digits);
    }

    static int[] plusOne(int[] digits) {
        int sum =0;
        int carry =0;
        int i =0;

        int size = digits.length;

        ArrayList<Integer> store = new ArrayList<>();

        for ( i=digits.length-1;i>=0;i--){
            
            if(i == digits.length-1){
                sum = digits[i] +1;
                store.addFirst(sum%10);
                carry = sum/10;
            }else{
            sum = digits[i] +carry;
            store.addFirst(sum%10);
            carry  = sum/10;
            }

            

           
            System.out.println(store);
        }
        if ( i <0 && carry==1){
                store.addFirst(carry);
            }

            System.out.println(store);

        int arr[] = new int[store.size()];

        for(i=0;i<store.size();i++){
            arr[i] = store.get(i);
        }

        System.out.println(sum);
        return arr;
    }
}
