import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        // int a =10;
        // int b = a;
        // a=50;
        // System.out.println("Before");
        // System.out.println("a :" +a + " " + "b :" +b);


        // b= 6;
        // System.out.println("Before");
        // System.out.println("a :" +a + " " + "b :" +b);

        // data_type[] variable_name = {values seperated by commas};  -> array structure

        // int[] a = {1,2,3,4,5};

        // int[] b = a;

        // System.out.println("Before changing the values in array");
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));

        // b[0] = 10;

        // System.out.println("After changing the values in array");
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));

        String name = "hari";

        String peyar = name;

        System.out.println("Before changing the value of string");
        System.out.println( "name :" + name);
        System.out.println("peyar :" + peyar);

        peyar = "sudhan";

        System.out.println("After changing the value of string");
        System.out.println( "name :" + name);
        System.out.println("peyar :" + peyar);



    }
}
