class Queue{
    static int size=7,front=0,rear=0;
    int q[]=new int[size];
   
   
    boolean isFull(){
        return rear==size;
    }
    void enQueue(int d){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else{
            q[rear]=d;
            rear++;
        }
    }
   
    boolean isEmpty(){
        return rear==0;
    }
    int deQueue(){
        if(isEmpty()){
            // System.out.println("Queue is empty");
            return -1;
        }
        int val=q[front];
        for(int i=1;i<=rear-1;i++){
            q[i-1]=q[i];
        }
        rear--;
        q[rear]=0;
        return val;
    }
   
    void display(){
        for(int i=0;i<rear;i++)
        {
            System.out.print(q[i]+" ");
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
        que.enQueue(60);
        que.enQueue(70);
        que.enQueue(80);
        que.display();
        System.out.println("Removed value is :"+que.deQueue());
        que.display();
     
        que.enQueue(80);
        que.enQueue(90);
        que.display();
        System.out.println("Removed value is :"+que.deQueue());
        System.out.println("Removed value is :"+que.deQueue());
        System.out.println("Removed value is :"+que.deQueue());
        System.out.println("Removed value is :"+que.deQueue());
        System.out.println("Removed value is :"+que.deQueue());
        System.out.println("Removed value is :"+que.deQueue());
        System.out.println("Removed value is :"+que.deQueue());
        System.out.println("Removed value is :"+que.deQueue());
        que.display();
    }
}

/*
OUTPUT:


Queue is Full
10 20 30 40 50 60 70
 
Removed value is :10
20 30 40 50 60 70
 
Queue is Full
20 30 40 50 60 70 80
 
Removed value is :20
Removed value is :30
Removed value is :40
Removed value is :50
Removed value is :60
Removed value is :70
Removed value is :80

Removed value is :-1

*/