// Leetocode 1929

/*
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 

Constraints:

n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
 */
import java.util.Arrays;

public class ArrayConcatation {
    public static void main(String[] args) {
        int [] arr={1,2,1};
        int n = arr.length;
         String result = Arrays.toString(arrConcat(arr));
        System.out.println(result);
       
    }

     static int[] arrConcat(int nums[]) {
        int n = nums.length;
        // System.out.println(n);
       
        int n1 = 2*n;
        // System.out.println(n1);
        int[] ans =new int[n1];
       
        
        for (int i=0;i<n1;i++){
           while(i<n){
              ans[i] = nums[i];
           System.out.println(nums[i]);
           i++;
            }

           if(i >=n){
            ans[i] = nums[i-n];
            System.out.println(ans[i]);
           
         
        }
           
            
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
