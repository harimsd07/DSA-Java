
import java.util.ArrayList;

class FibPrimeSum{
    public static void main(String[] args) {
        int n=11;
        int ans =fibinocci(n);
        System.out.println(ans);
    }

     static int fibinocci(int n) {
        ArrayList<Integer> fiboNum= new ArrayList<>();
   
        int a =0;
        fiboNum.add(a);
        int b=1;
        int count=2;


        while(count<=n){
            int temp = b;
             b= b+a;
             fiboNum.add(b);
             a = temp;
             count++;
        }
        System.out.println(b);
       System.out.println(fiboNum.toString()); 

        int sum = 0;
        for (int num : fiboNum) {
            
            if (checkPrime1(num)) {
                sum = sum + num;
            }
        }
     return sum;  
}

static boolean checkPrime1(long number){

         if(number <2){
            return false;
        }

        double start = 2;  // because we known that prime number starts from 2

        while(number >start*start){
            if(number % start == 0){
                return false;
            }

            start = start +1; 
            // both start++ and start = start+1 are same
    }
      return true; 
}
}