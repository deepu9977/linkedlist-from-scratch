class Node {
    public int value;
    public Node next;
}


public class CircularLinkedList{
    Node head;
    Node tail;
    int size;

public Node createCsll(int Nodeval){
head = new Node();
Node node = new Node();
node.value=Nodeval;
node.next=node;
head=node;
tail=node;
size=1;
return head;
}

// insert in Circular Linked List

public void insertCSLL(int nodeVal,int location){
    Node newNode = new Node();
    newNode.value=nodeVal;
    if(head==null){
        createCsll(nodeVal);
        return;
    }else if(location==0){
        newNode.next=head;
        head=newNode;
        tail.next=newNode;
    }else if(location>=size){
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
    }else{
        Node temp = head;
        int index=0;
        for(int i=0;i<location-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    size++;
}

// Traversal in a Singly Linked List 

public void traverseCsll(){
    if(head!=null){
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value+"-->");
            tempNode=tempNode.next;
        }System.out.println(head.value);
    }else{
        System.out.println("empty");
    }
}

//  Searching for a value in a Circular Singly  Linked list

public void searchInCsll(int Nodeval){
    if(head!=null){
        Node currNode = head;
        for (int i = 0; i < size; i++) {
            if(currNode.value==Nodeval){
                System.out.println("Node val is found at "+ i);
            }
            currNode=currNode.next;
        }
    }else{
        System.out.println("Value not found");
    }
}


// Delete in a Circular Singly Linked list 

public void deleteInCsll(int location){
    if(head==null){
        System.out.println(" list is empty");
    }else if(location==0){
        head.next=head;
        tail=head;
        size--;
        if(size==0){
            head=tail=null;
        }
    }else if(location>=size){
        Node currNode = head;
        for (int i = 0; i < size-1; i++) {
            currNode=currNode.next;
        }
      if(currNode==head){
currNode.next=null;
head=tail=null;
      }
     currNode.next=head;
     currNode=tail;
     size--;
    }else{
        Node tempNode =head;
       
        for (int i = 0; i < location-1; i++) {
            tempNode=tempNode.next;
        }
        tempNode.next=tempNode.next.next;
        size--;
    }
}

// Delete entire circular singly  linked list

void delete(){
    if(head==null){
        System.out.println("list is empty");
    }else{
        tail.next=null;
        head=tail=null;
        size=0;
        
        System.out.println("list is deleted");
    }
    
}



public static void main(String[] args) {
    CircularLinkedList csll = new CircularLinkedList();
    csll.createCsll(5);
    csll.insertCSLL(4,0);
    csll.insertCSLL(3, 2);
    csll.insertCSLL(6, 3);
    csll.insertCSLL(7, 4);
    csll.insertCSLL(8, 5);
   
    System.out.println(csll.size);
    csll.traverseCsll();
    csll.searchInCsll(6);
    csll.deleteInCsll(3);
    csll.traverseCsll();
    System.out.println(csll.size);
csll.delete();
System.out.println(csll.size);

}
}






