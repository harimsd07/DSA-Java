
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find fibo: " );
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int count  =2;

        while(count <= num){
         int c = a+b;
         a= b;
        b=c;
        count ++;
        }

        System.out.println("result:" +b);

    }
}
