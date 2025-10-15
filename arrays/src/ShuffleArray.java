import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        
        shuffleArray(nums);
    }

    private static void shuffleArray(int[] nums) {
        int size = nums.length;

        int mid =  size/2;
        // System.out.println(mid);

        int[] ans = new int[size];
         int j =0;
        for (int i=0;i<size-1;i++){
            
            if (i % 2 == 0){
                if(i ==0){
                  ans[i]= nums[i];
                    System.out.println(ans[i]);  
                }else{
                     ans[i]= nums[mid-i];
                    System.out.println(ans[i]);
                }
                    
            }
            if(i % 2 != 0){
               
                ans[i] = nums[mid + j];
                  System.out.println(ans[i]);
                  j++;                   
                  }
                  
            System.out.println(Arrays.toString(nums));
        }

        System.out.println(Arrays.toString(nums));
    }
}
