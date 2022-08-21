public class SinglyLL {
    Node head;
    Node tail;
    int size;

    public Node createSingLL(int Nodeval) {
        head = new Node();
        Node newNode = new Node();
        newNode.next = null;
        newNode.val = Nodeval;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    public void insertAt(int NodeVal, int location) {
        Node newnode = new Node();
        newnode.val = NodeVal;
        if (head == null) {
            createSingLL(NodeVal);
            return;
        } else if (location == 0) {
            newnode.next = head;
            head = newnode;

        } else if (location >= size) {
            newnode.next = null;
            tail.next = newnode;
            tail = newnode;

        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node temp2 = tempNode.next;
            tempNode.next = newnode;
            newnode.next = temp2;

        }
        size++;

    }

    // TRAVERSAL IN SINGLY LINKED LIST

    public void traversalList() {
        if (head == null) {
            System.out.println("empty list ");
        } else {
            Node temp = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temp.val + "-->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    // Search for the NodeValue in a given linked list

    public boolean findVal(int Nodeval) {

        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.val == Nodeval) {
                    System.out.println("value found at index" + i);
                    return true;
                }
                tempNode = tempNode.next;
            }

        }
        System.out.println("Value not found in ll");
        return false;

    }

    // delete at the index

    public void delete(int location) {
        if (head == null) {
            System.out.println("empty");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
        } else if (location >= size) {
            Node temp = head;
            for (int i = 0; i < size - 1; i++) {
                temp = temp.next;
            }
            if (temp == head) {
                tail = head = null;
                size--;
            }
            temp.next = null;
            tail = temp;
            size--;

        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

}