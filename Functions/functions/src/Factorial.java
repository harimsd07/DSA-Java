
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        System.out.println("Factorial of given number :"+factorial(num));
    
    }

     static int factorial(int num) {
        int factorialValue = 1;
        while(num>1){
        factorialValue = factorialValue * num * (num-1);
        System.out.println(factorialValue);
        num-=2;
        System.out.println(num);
        }
        return factorialValue;
    }
}
