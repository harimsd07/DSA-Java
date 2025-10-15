/*
 * 1431. Kids With the Greatest Number of Candies
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

 

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false] 
Explanation: There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
Example 3:

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]
 

Constraints:

n == candies.length
2 <= n <= 100
1 <= candies[i] <= 100
1 <= extraCandies <= 50
 */
import java.util.Arrays;
import java.util.List;

public class Lt1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCand = 3;

        List result = greaterCandies(candies,extraCand);
        System.out.println(Arrays.asList(result));
    }

 static List<Boolean> greaterCandies(int[] candies, int extraCand) {
        int size = candies.length;

        int[] ans = new int[size];
        for (int i=0;i<size;i++){
            ans[i] = candies[i] +extraCand;  
        }
            // System.out.println(Arrays.toString(ans));

       
        return maxValueCompare(ans,candies);
    }

 static List<Boolean> maxValueCompare(int[] ans, int[] candies) {
            
         int[] finalAns = new int[ans.length];
            int max =0;
         for (int i =0;i<ans.length;i++){
            for (int j =0;j<candies.length;j++){
                if(ans[i] >= candies[j]){
                    max = ans[i];
                }else{
                    max =0;
                    break;
                }
            }
            finalAns[i] = max;
            System.out.println(finalAns[i]);
         }
         Boolean[] result = new Boolean[finalAns.length];
        for (int i =0; i<finalAns.length;i++){
            if(finalAns[i] > 0){
              result[i] = true;
            }
            else{
                result[i] = false;
            }
        }
        // System.out.println(Arrays.toString(result));
        
        List<Boolean> booleanList = Arrays.asList(result);
         return Arrays.asList(result) ;

}
}


/*
 * 
 * Optimized version
 * import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lt1431_Optimized {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCand = 3;

        List<Boolean> result = kidsWithCandies(candies, extraCand);
        System.out.println(result); // Output: [true, true, true, false, true]
    }

    
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         1. Find the maximum number of candies any kid has.
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

         2. Create a result list.
        List<Boolean> result = new ArrayList<>();

         3. Check for each kid if they can have the greatest number of candies.
        for (int candy : candies) {
             Add true if their candies + extra is >= the max, otherwise add false.
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}
 */