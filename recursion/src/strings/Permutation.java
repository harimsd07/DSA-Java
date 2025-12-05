package strings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String value = "abc";

        permutation("", value);

    }

    static void permutation(String result,String input){

        if(input.isEmpty()){
            System.out.println(result);
            return;
        }

        char ch  = input.charAt(0);
        
        for(int i=0;i<=result.length();i++){
            String first = result.substring(0,i);

            String second = result.substring(i,result.length());

            permutation(first+ch+second, input.substring(1));
        }
    }

     static ArrayList<String> permutation(String result,String input){

        if(input.isEmpty()){
            ArrayList<String> list = new ArrayList<>();

            list.add(result);
            System.out.println(list);
            return list;
        }

        char ch  = input.charAt(0);
        
        for(int i=0;i<=result.length();i++){
            String first = result.substring(0,i);

            String second = result.substring(i,result.length());

            permutation(first+ch+second, input.substring(1));
        }
    }

}
