

public class QueueUsingLL {
    Node head=null;
    Node tail=null;
    boolean isempty(){
        return head==null && tail==null;
    }


    void enqueue(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
        }

        tail.next=newnode;
        tail=newnode;
    }

    int dequeue(){
        if(head==null){
            return -1 ;
        }else{
            Node temp=head;
            head=head.next;
            return temp.data;
        }
        
    }

    int peek(){
        if(head==null){
            return -1;
        }
        return head.data;
    }

    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
        QueueUsingLL qll=new QueueUsingLL();
        qll.enqueue(10);
        qll.enqueue(20);
        qll.enqueue(30);
        qll.enqueue(40);
        qll.dequeue();
        qll.print();
    }
}
