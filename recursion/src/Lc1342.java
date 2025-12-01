public class Lc1342 {
    public static void main(String[] args) {
        int num =123;
        int ans =noOFSteps(num);
        System.out.println(ans);
    }

    static int noOFSteps(int n){

       

        return helper(n,0);
    }

     static int helper(int n, int count) {
         if(n == 0){
            return count;
        }
        if( n %2 ==0){
            
           return helper(n/2,count+1);
        }
           
           return helper(n-1,count+1);
        
    }
}
