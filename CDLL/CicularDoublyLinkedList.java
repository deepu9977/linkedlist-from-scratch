import java.time.LocalDate;

class DoublyNode {
    int value;
    DoublyNode next;
    DoublyNode prev;
}

public class CicularDoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createCDLL(int nodeVal) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeVal;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

    // Insertion method in Circular Doubly Linked List

    void inserDcll(int nodeVal, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeVal;
        if (head == null) {
            createCDLL(nodeVal);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempnode = head;
            int index = 0;
            while (index < location - 1) {
                tempnode = tempnode.next;
                index++;
            }
            newNode.next = tempnode.next;
            newNode.prev = tempnode;
            tempnode.next = newNode;
            newNode.next.prev = newNode;

        }
        size++;
    }

    // Traversal in Circular Doubly Linked List

    void traversal() {
        DoublyNode tempNode = head;
        if (head != null) {
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value + "--->");
                tempNode = tempNode.next;
            }
            System.out.println(tempNode.value);
        } else {
            System.out.println("List is Empty");
        }
    }

    // Reverse traversal

    void reverseTraversal() {
        DoublyNode tempNode = tail;
        if (tail != null) {
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value + "--->");
                tempNode = tempNode.prev;
            }
            System.out.println(tail.value);
        } else {
            System.out.println("List is empty");
        }
    }

    // Search for the value

    void searchNode(int nodeVal) {
        DoublyNode tempNode = head;
        if (head != null) {
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeVal) {
                    System.out.println("The value is found at index " + i);
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("node not found ");
    }

    // deletion in Circular Doubly Linked List

    void deleteCdll(int location) {
        if (head != null) {
            if (location == 0) {
                if (size == 1) {
                    head.prev = null;
                    head.next = null;
                    head = null;
                    tail = null;
                    size--;
                    return;

                } else {
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                    size--;
                }
            } else if (location >= size) {
                if (size == 1) {
                    head.prev = null;
                    head.next = null;
                    head = null;
                    tail = null;
                    size--;
                    return;
                } else {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                    size--;
                }
            } else {
                DoublyNode tempNode = head;
                for (int i = 0; i < location-1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                tempNode.next.prev = tempNode;
                size--;
            }
        }
    }


    // Clear the Circular Doubly Linked List 

void clear(){
    DoublyNode tempNode = head;
   if(head!=null){
    for (int i = 0; i < size; i++) {
        tempNode.prev = null;
        tempNode  = tempNode.next;
    }
    head=null;
    tail=null;
    size = 0;
   }
}



    // Main Method

    public static void main(String[] args) {
        CicularDoublyLinkedList cdll = new CicularDoublyLinkedList();
        cdll.createCDLL(5);
        cdll.inserDcll(1, 0);
        cdll.inserDcll(2, 3);
        cdll.inserDcll(4, 2);
        cdll.inserDcll(10, 6);
        System.out.println(cdll.head.value);
        System.out.println(cdll.tail.value);
        System.out.println(cdll.size);
        cdll.traversal();
      cdll.deleteCdll(2);
      cdll.traversal();
      System.out.println(cdll.size);
      cdll.clear();
      cdll.traversal();
      System.out.println(cdll.size);
      
      

    }
}