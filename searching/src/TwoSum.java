import java.util.Arrays;

public class TwoSum {
public static void main(String[] args) {
    int[] numbers = {2,7,11,15};
    int target = 22;
    int[] ans = twoSum(numbers,target);
    System.out.println(Arrays.toString(ans));
}

static int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        
        if(numbers.length == 0){
            return new int[] {-1,-1};
        }
        for(int i=0;i<size;i++){
            for (int j =i+1;j<size;j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
            }
        }
    return new int[]{-1,-1};   
}
}
