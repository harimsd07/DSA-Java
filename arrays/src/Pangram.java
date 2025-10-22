
import java.lang.reflect.Array;
import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        // String value = "thequickbrownfoxjumpsoverthelazydog";
        String input = "thequickbrownfoxjumpsoverthelazydog";
        

    boolean result =checkPanagram(input);
    System.out.println(result);
    }

    static boolean  checkPanagram(String sentence) {
        char[] value = sentence.toCharArray();
        Arrays.sort(value);
        System.out.println(value);

        if(value.length == 0 || value.length <26){
            return false;
        }
        
        int count =0;
        for (int i =0;i<sentence.length();i++){
            if ( i ==0 || value[i] != value[i-1]){
                count ++;
            }
        }

        if (count == 26){
            return true;
        }
        
        return false;
    }
}
