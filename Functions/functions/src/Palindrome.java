import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        System.out.println(palindrome(num));
    }

     static boolean  palindrome(int num) {
        
        int finalValue =0;

        int value =0;
        int originalNum =num;

        while(num>0){
        value= num %10;

        finalValue = finalValue *10 +value;
        num = num/10;
        }
        
      
    return finalValue == originalNum;
    }
}
