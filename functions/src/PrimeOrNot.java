
import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int value = input.nextInt();
         
          if(value <2){
            System.out.println("not prime");
          }

          for(int i =2; i < value; i++){
            if(value % i == 0){
                 System.out.println("not prime"); 
                 break; 
            }else{
                System.out.println("prime");
            }
        }         
    }
}
