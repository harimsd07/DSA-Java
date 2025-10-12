// Leetcode 1480

/*
 * 
Topics
premium lock icon
Companies
Hint
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
 

Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6

 */
import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};

        String result = Arrays.toString(runningSum(nums));
        System.err.println(result);
    }

     static int[] runningSum(int[] nums) {
        int size = nums.length;
         int[] ans = new int[size];
        for(int i=0;i<size;i++){
            if(i==0){
                ans[i] = nums[i];
               System.err.println(ans[i]); 
               i++;
            }
            if(i>0 && i<size){
            ans[i] = nums[i] + ans[i-1];
            System.err.println(ans[i]);
            }
        }

        return ans;
    }
}
