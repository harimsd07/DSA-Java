public class FlowChartConcepts{
    public static void main(String[] args) {
        // String name = "irah";
        
        // System.out.println("Hello Employee "+ name);


        // double result = addBonus(5000);

        // System.out.println("Salary: " +result);

        // System.out.println(checkPrime1(218907677));

        checkTime();
    }

    static  double addBonus(double salary){

        if(salary > 10000){
            salary = salary +2000;
        }else{
            salary = salary+1000;
        }
        return salary;
    }

    static boolean checkPrime(long number){
        if(number <2){
            return false;
        }

        int start = 2;  // because we known that prime number starts from 2

        while(number >start){
            if(number % start == 0){
                return false;
            }

            start = start +1; 
            // both start++ and start = start+1 are same
        }
        return true;
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

static  void checkTime(){
    long hugeNumber = 136279841; // A prime number approx 1 million

    // --- Measure Method 1 ---
    long startTime1 = System.nanoTime();
    checkPrime(hugeNumber);
    long endTime1 = System.nanoTime();
    
    // --- Measure Method 2 ---
    long startTime2 = System.nanoTime();
    checkPrime1(hugeNumber);
    long endTime2 = System.nanoTime();

    // --- Print Results ---
    System.out.println("Method 1 took: " + (endTime1 - startTime1) + " nanoseconds");
    System.out.println("Method 2 took: " + (endTime2 - startTime2) + " nanoseconds");
}
}
