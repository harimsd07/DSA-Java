class LinkedListDemo {

    private Node head;
    private Node tail;
    private int size;

     LinkedListDemo() {
        this.size = 0;
    }


    public void insertValueAtFirstPos(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail ==null){
            tail = head;
        }
        size +=1;
    }

    public void insertValueAtLastPos(int value){
        Node node = new Node(value);

        if(tail == null){
            insertValueAtFirstPos(value);
            return;
        }
        tail.next = node;
        tail = node;

        size +=1;
    }

    public void deleteAtFirstPos(){
        int value = head.value;

        head = head.next;

        if(head == null){
            tail = null;
        }

        size -=1;
    }

    public void deleteAtLastPos(){

        if(size <=1 ){
            deleteAtFirstPos();
        }
        Node secondLast = get(size-2);

        tail = secondLast;
        tail.next = null;

        size-=1;
    }

    public Node get(int index) {
       Node node = head;

       for(int i =0;i<index;i++){
        node = node.next;
       }
       return node;
    }


    public void insertValue(int value,int index){
        Node temp = head;
        if(index == 0){
            insertValueAtFirstPos(value);
            return;
        }

        if(index == size){
            insertValueAtLastPos(value);
            return;
        }

        for(int i=0 ;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next =node;
        size +=1;
    }

    public void deleteValue(int index){

        if (index ==0) {
            deleteAtFirstPos();
        }

        if(index == size-1){
            deleteAtLastPos();
        }

        Node previousNode = get(index-1);

        previousNode.next = previousNode.next.next;

        size -=1;
    }


    public Node find(int value){
        Node node = head;

        for(int i=0;i<size;i++){
            if(value == node.value){
                return node;
            }
            node= node.next;
        }

        return null;
    }

    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    
    private class Node{
        private int value;
        private Node next;

        public Node(int value,Node next) {
            this.next = next;
            this.value = value;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
