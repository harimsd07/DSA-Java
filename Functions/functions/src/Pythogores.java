import java.util.Scanner;

public class Pythogores {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to x: ");
        int x = input.nextInt();

          System.out.println("Enter the number to y: ");
        int y = input.nextInt();

          System.out.println("Enter the number to z: ");
        int z = input.nextInt();

        System.err.println(pythagores(x,y,z));
    
       
    }

      static boolean pythagores(int x, int y, int z) {
         int lhs = (x*x) +(y*y);
         int rhs =(z*z);
         
         if(lhs==rhs){
            return true;
         }
         return false;
      }
      
}