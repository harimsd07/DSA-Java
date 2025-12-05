package strings;

import java.util.ArrayList;

public class SubSequence {

    public static void main(String[] args) {
        String value = "abc";
        System.out.println(subSequenceAscii1("", value));
        // subSequenceAscii("", value);
    }

    static  void  subSequence(String result , String input){

        if(input.isEmpty()){
            System.out.println(result);
            return;
        }

        char ch = input.charAt(0);

        subSequence(result+ch, input.substring(1));

         subSequence(result, input.substring(1));
    }


    static ArrayList<String> subSequence1(String result,String input){
        if(input.isEmpty()){
            ArrayList<String> list = new ArrayList<>();

            list.add(result);
            System.out.println(list);
            return list;
        }

        char ch = input.charAt(0);

      ArrayList<String> left =   subSequence1(result+ch, input.substring(1));

       ArrayList<String> right =  subSequence1(result, input.substring(1));

       left.addAll(right);

       return left;
    }

    static  void  subSequenceAscii(String result , String input){

        if(input.isEmpty()){
            System.out.println(result);
            return;
        }

        char ch = input.charAt(0);

        subSequenceAscii(result+ch, input.substring(1));

         subSequenceAscii(result, input.substring(1));

         subSequenceAscii(result +(ch+0), input.substring(1));
    }


    static ArrayList<String> subSequenceAscii1(String result,String input){
        if(input.isEmpty()){
            ArrayList<String> list = new ArrayList<>();

            list.add(result);
            System.out.println(list);
            return list;
        }

        char ch = input.charAt(0);

      ArrayList<String> left =   subSequenceAscii1(result+ch, input.substring(1));

       ArrayList<String> right =  subSequenceAscii1(result, input.substring(1));
       
       ArrayList<String> ascii = subSequenceAscii1(result+(ch+0), input.substring(1));

       left.addAll(right);
       left.addAll(ascii);

       return left;
    }


}
