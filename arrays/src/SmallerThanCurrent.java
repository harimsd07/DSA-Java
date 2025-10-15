import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};

        int[] result =smallerThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] smallerThanCurrent(int[] nums) {
        int count =0;
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    j++;
                }
                    if (nums[i] > nums[j]){
                        System.out.println("I:" + nums[i] +" " + "J: " +nums[j]) ;
                        count ++;
                        System.out.println(count);
                    }else{
                         System.out.println("I:" + nums[i] +" " + "J: " +nums[j]) ;
                        count =count;
                        
                    }
                    count=0;
            }
            ans[i] = count;
            System.out.println(Arrays.toString(ans));
        }    
       return ans; 
    }
}
