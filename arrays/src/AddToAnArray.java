import java.util.ArrayList;
import java.util.List;

public class AddToAnArray {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k =806;
        
        addToArray(num,k);
    }

    static List<Integer> addToArray(int[] num,int k) {
        ArrayList<Integer> list = new ArrayList<>();
            int i = num.length-1;
           while(i>=0 || k>0){
                if(i>=0){
                    
                k = k + num[i--]; 
                
                // k =519
                 System.out.println(k);
                }
                 list.addFirst(k%10);
                // add value 9 

                 System.out.println(list);
                
                k /=10;
            }
        System.out.println(list);
        

        return list;
        }
}
