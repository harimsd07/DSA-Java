
import java.util.Scanner;

public class PrimeOrNot {
 
    public static void main(String[] args) {
      System.out.println();
    //    Scanner input = new Scanner(System.in);
    //    System.out.println("Enter number: ");
    //     int num = input.nextInt();
    //     int c =2;
    //     if (num<2){
    //       System.out.println("neither prime nor composite");
    //     }
    //     while(c <num){
    //       if(num % c ==0){
    //         System.out.println("not prime");
    //         break;
    //       }
    //       c +=1;
          
    //     }   
    //     if(num ==c)  {       
    //     System.out.println("prime"); 
    //     }
     }

    static void primeOrNotSqRoot(){
      Scanner input = new Scanner(System.in);
       System.out.println("Enter number: ");
        int num = input.nextInt();
        int c =2;
        if (num<2){
          System.out.println("neither prime nor composite");
        }
        while(c *c <=num){
          if(num % c ==0){
            System.out.println("nor prime");
            break;
          }
          c +=1;
          
        }   
        if(c*c>num)
         System.out.println(" prime");
    }

    // static int primeBetweenNumbers(){
    //     Scanner input = new Scanner(System.in);
    //    System.out.println("Enter number start value: ");
    //     int start = input.nextInt();

    //      System.out.println("Enter number end value: ");
    //     int end = input.nextInt();

    //     if(start<2){
    //         start =start+1;
    //     }
        
    //     for(int i = start;i<end;i++){
    //       int c= 2;
    //       while(c<i){
    //       if(i % c !=0){
    //         System.out.println(i);
    //       }
    //       c+=1;
           
          
          
    //     }
         
          
    //     }
    //     return 0;
    // }
    
}

