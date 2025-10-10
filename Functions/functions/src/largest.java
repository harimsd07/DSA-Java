
import java.util.Arrays;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        
    }

    static void largest(){
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int arr[] = new int[size];

        for(int i =0;i<size;i++){
            arr[i] =input.nextInt();
        }
        
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        
        for(int i=0; i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
            System.out.println("Max value: " + max);
    }
}
