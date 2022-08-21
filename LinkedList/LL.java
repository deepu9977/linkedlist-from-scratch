public class LL {
   
   static Node head;


   static class Node{

        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }


// Add First
static void addFirst(String data){
    Node newNode = new Node(data);


    newNode.next=head;
    head = newNode;
}

// Add Last 

static void addLast(String data){
    Node newNode = new Node(data);
    if(head==null){
newNode=head;
return;
    }

    Node LastNode = head;
while(LastNode.next!=null){
    LastNode=LastNode.next;
}
LastNode.next=newNode;
}

// For printing New LinkedList

static void printList(){
    Node curNode = head;

  while(curNode!=null){
      System.out.print(curNode.data + "  -->");
      curNode=curNode.next;
  }
  System.out.println("Null");
}


// for calculating the size 



public static void main(String[] args) {
    LL list = new LL();
    list.addFirst("moring");
    list.addFirst("good");
    list.addFirst("hello");
    list.addLast("deepu");
    list.printList();

}


}
