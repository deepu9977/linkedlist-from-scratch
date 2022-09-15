package LinkedList;

public class LL {
   protected Node head;
    protected Node tail;
   static int size =0;

   void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail = newNode;
        }
        size++;
    }
    int deletefirst(){
       int val = head.data;
       head = head.next;
       size--;
       return val;

    }
    void print(){
       Node temp = head;
       while(temp!=null){
           System.out.print(temp.data+"--> ");
           temp = temp.next;
       }
        System.out.println("NULL");
    }

}
