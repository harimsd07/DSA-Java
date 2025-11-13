public class GreaterThanTargetElement {
    public static void main(String[] args) {
        // char[] letters = {'c','f','j'};
        char[] letters = {'x','x','y','y'};
        char target = 'z';

        char ans = greaterThanTarget(letters,target);
        System.out.println(ans);
    }

    static char greaterThanTarget(char[] letters, char target) {

        int start =0;
        int end = letters.length-1;
        char ans = letters[0];
        
        while(start <= end){
            int mid = start + (end -start)/2;
        if(target < letters[mid]){
            ans = letters[mid];
            end = mid -1;
        }
        else{
            start = mid+1;  
        } 
        }

       
    

    return ans;
    }
}
