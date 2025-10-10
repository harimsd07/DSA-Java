
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value = input.nextInt();   // for example,value = 12345;
        int ReverseNum =0;

        
        while(value !=0){
        int modValue = value % 10;
        // System.out.println(modValue);

           
        value = value /10;
        // System.out.println(value);
              ReverseNum = ReverseNum*10 +modValue;
             
        
        }
       
        System.out.println(ReverseNum);
                                                                                                                                                                                                                                                ;
    }
}
