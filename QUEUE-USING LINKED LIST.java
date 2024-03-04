class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}

class Queue{
    Node front=null,rear=null;
    static int size=0;
   
    void enQueue(int d){
        Node node=new Node(d);
        if(front==null){
            front=node;
            rear=node;
        }
        else{
            rear.next=node;
            rear=rear.next;
        }
        size++;
    }
   
    boolean isEmpty(){
        return front==null;
    }
    int deQueue(){
        if(isEmpty()){
            return -1;
        }
        int val=front.data;
        front=front.next;
        size--;
        return val;
    }
   
    void display(){
        Node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

class Main{
    public static void main(String[]args){
        Queue que=new Queue();
        que.enQueue(10);
        que.enQueue(20);
        que.enQueue(30);
        que.enQueue(40);
        que.enQueue(50);
        que.display();
        System.out.println("Removed value is:"+que.deQueue());
        que.display();
    }
}

/*

OUTPUT:

10 20 30 40 50
Removed value is:10
20 30 40 50

*/