public class RecursionBasics {
    static int sum =0;  
    public static void main(String[] args) {
       System.out.println();
       System.out.println(countOfANumber(12321));
    }

    static int factorial(int n){

        int sum =0;

        if (n<1){
            return 1;
        }
        sum = n * factorial(n-1);
        
        return sum;
    }

    static int sumOfNNumbers(int n){

        int sum =0;

        if (n<1){
            return 0;
        }
        sum = n + sumOfNNumbers(n-1);
        
        return sum;
    }

    static int sumOfDigits(int n){
        //  n= 11567
        if(n==0){
        return 0; 
        }
        return  (n%10) + sumOfDigits(n/10);
    }

    static int productOfDigits(int n){
        //  n= 11567
        if(n%10 == n){
        return n; 
        }
        return  (n%10) * productOfDigits(n/10);
    }
   
     static int reverseOfNumber(int n){
        //  n= 115607

       
        if(n==0 ){
        return 0; 
        }
        // System.out.println((n%10)*10);

        int rem =n%10 ;

        sum = sum*10 +rem; 
        
         reverseOfNumber(n/10);
        //  System.out.println(sum);
        return sum;
         
    }

    static boolean palindrome(int n){
        return n == reverseOfNumber(n);
    }
    static int count =0;
    static int countOfANumber(int n){
        
        if( n==0){
            return count;
        }
        int rem = n%10;
        
        if(rem ==8){
            count++;
        }
        countOfANumber(n/10);
    
        return count;
    }
}
