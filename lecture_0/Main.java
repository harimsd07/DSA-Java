import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b = a;

        // int[] a = {10,20,15,23,1};

        // int[] b =a;

        // System.out.println("Before changing with b:");
        // System.out.println("Array " + Arrays.toString(a));
        // System.out.println("Array " + Arrays.toString(b));

        // b[0] = 18;

        // System.out.println("after changing with b:");
        // System.out.println("Array " + Arrays.toString(a));
        // System.out.println("Array " + Arrays.toString(b));



        String  name = "hari";

        // String name = new String(); it is not possible because the name reference is already in the stack,
        //  we can't create a new ref with same name.

        String peyar = new String(name);

        

        System.out.println("before changing :");
        System.out.println("Name :" + name);

        System.out.println("peyar :" + peyar);

        peyar = "sudhan";

        System.out.println("After changing :");

        System.out.println("Name :" + name);



        System.out.println("peyar :" + peyar);



        // System.out.println("a :" +a + " " + "b:" +b);
    }
}
