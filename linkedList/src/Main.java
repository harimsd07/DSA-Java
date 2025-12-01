
public class Main {
    public static void main(String[] args) {
    LinkedListDemo value = new LinkedListDemo();

    value.insertValueAtFirstPos(17);
     value.insertValueAtFirstPos(21);
     value.insertValueAtFirstPos(33);
     value.insertValueAtFirstPos(12);
     value.insertValueAtFirstPos(7);

        value.display();

     value.insertValueAtLastPos(10);
     value.insertValueAtLastPos(12);
     value.insertValueAtLastPos(20);

      value.display();

    //  value.insertValue(25, 6);
    //  value.display();

      value.insertValueAtLastPos(30);
     value.display();

     value.deleteAtFirstPos();
     value.display();

     value.deleteAtLastPos();
     value.display();

     value.deleteValue(4);
     value.display();

     System.out.println(value.find(17));
    }
}
