public class SquareRt {
    public static void main(String[] args) {
        int x =2147483647;

        int ans = squareRoot(x);
        System.out.println(ans);
    }

    // static int simpleSquareRoot(int x) {
    //         for(int i =1;i<=x;i++){
    //             if (i * i == x){
    //                 return i;
    //             }
    //             if(i * i > x){
    //                 return squareRoot(x, i-1, i);
    //             }
    //         }
            
    //         return -1;
    // }

    static int squareRoot(int x) {

        if (x == 0 || x ==1){
            return x;
        }
        int start = 1;
        int end = x;
          
            
            
            while(start <= end){
              int mid = start + (end-start)/2;
            if ((long) mid * mid == x){
                return mid;
            }else if(x > (long)mid * mid){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        
        
    return Math.round(end);
    }
}
