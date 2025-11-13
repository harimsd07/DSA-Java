import java.nio.file.FileStore;
import java.util.Arrays;

public class IndexOfTargetElement {
    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 2;

        int[] ans = indexPosition(nums,target);
        System.out.println(Arrays.toString(ans));
    }

     static int[] indexPosition(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start =binSearch(nums, target, true) ;
        int end  = binSearch(nums, target, false);

        ans[0] = start;
        ans[1] = end;
            return ans;
    
    }

      static int binSearch(int[] nums, int target,boolean firstIndex) {
        int start =0;
        int end = nums.length-1;
        int ans =-1;
        while(start <=end){
            int mid = start +(end - start)/2;
            if (nums[mid] == target){
                ans = mid;
                if(firstIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            }else if(target > nums[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        
        return ans;
     }
    
}
