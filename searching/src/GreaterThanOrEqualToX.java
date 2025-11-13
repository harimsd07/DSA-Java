public class GreaterThanOrEqualToX {
    public static void main(String[] args) {
        int [] nums = {0,4,3,0,4};

        int ans = greaterThanOrEqualToX(nums);
        System.out.println(ans);
        
    }

     static  int greaterThanOrEqualToX (int[] nums) {

        int size = nums.length;
        int count =0;

        for (int i=0;i<size;i++){
            if (nums[i] > 0){
                count ++;
            }
        }
        if ( count == 0){
            return -1;
        }
        return count;
    }
}
