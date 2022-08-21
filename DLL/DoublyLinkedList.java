
class DoublyNode{
    int value;
    DoublyNode next;
    DoublyNode prev;
}
public class DoublyLinkedList{
DoublyNode head;
DoublyNode tail;
int size;

// Creating a Doubly Linked List 

public DoublyNode createDll(int nodeVal){
    head =new DoublyNode();
    DoublyNode newNode = new DoublyNode();
    newNode.value=nodeVal;
   newNode.next=null;
   newNode.prev=null;
    head=newNode;
    tail=newNode;
    size=1;
    return head;
}

// Insert value in a Doubly Linked List

public void insert(int Nodeval,int location){
    DoublyNode newNode = new DoublyNode();
    newNode.value=Nodeval;
    if(head==null){
      createDll(Nodeval);
             return;
    }
    else if(location == 0){
        newNode.next=head;
        newNode.prev=null;
        head.prev=newNode;
        head=newNode;
        
    }else if(location >= size){
        newNode.next=null;
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }else{
        DoublyNode temp = head;
        int index=0;
        while(index < location-1){
            temp=temp.next;
            index++;
        }
        newNode.prev=temp;
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.next.prev=newNode;
    }
    size++;
}
//  TRAVERSAL OR PRINTING THE LINKED LIST 

public void print(){
    DoublyNode tempNode = head;
    if(head!=null){
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value+"<----->");
            tempNode = tempNode.next;
        }
        System.out.println("Null");
    }else{
        System.out.println("list is empty");
    }
}

// Reverse traversal in Doubly Linked List
public void reverse(){
    DoublyNode revNode = tail;
   if(head!=null){
    for (int i = 0; i < size; i++) {
        System.out.print(revNode.value+"<------>");
        revNode=revNode.prev;
    }
    System.out.println("Null");
   }else{
       System.out.println("list is empty");
   }
}

// Search in a Doubly Linked List 

public void search(int nodeval){
    DoublyNode tempnode = head;
    if(head!=null){
        for (int i = 0; i < size; i++) {
            if(tempnode.value==nodeval){
                System.out.println("Find the node at index "+ i);
                return;
            }
            tempnode=tempnode.next;
        }
    }
    
        System.out.println("Node not found ");
    

}


// delete in the Doubly Linked list 

public void deleteNode(int location){
    if(head==null){
        System.out.println("list is empty");
        return;
    }else if(location == 0){
        if(size==1){
            head=null;
            tail=null;
            size--;
            return;
        }else{
            head=head.next;
            head.prev=null;
            size--;
        }
    }else if(location >= size){
        DoublyNode tempNode = tail.prev;
        if(size == 1){
            head=null;
            tail=null;
            size--;
            return;
        }else{
           tempNode.next=null;
           tail=tempNode;
           size--;
        }
    }else{
        DoublyNode tempnode = head;
        for (int i = 0; i < location-1; i++) {
            tempnode=tempnode.next;
        }
        tempnode.next=tempnode.next.next;
        tempnode.next.prev=tempnode;
        size--;
    }
}


// Deleting full Doubly Linked list

public void deleteall(){
    DoublyNode tempNode = head;
    for (int i = 0; i < size; i++) {
        tempNode.prev=null;
        tempNode=tempNode.next;
    }
    head=tail=null;
}

public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.insert(1, 0);
    dll.insert(2, 2);
    dll.insert(3, 3);
    dll.insert(4, 4);
    System.out.println(dll.head.value);
    System.out.println(dll.tail.value);
    System.out.println("The size of the list is "+dll.size);
    dll.print();
   dll.deleteNode(0);
   dll.deleteNode(3);
   dll.print();
   dll.deleteall();
   dll.print();


}
}