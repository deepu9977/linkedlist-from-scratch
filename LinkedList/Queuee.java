package LinkedList;

public class Queuee extends  LL{

void enque(int data){
    Node newNode = new Node(data);
    if(head==null){
        newNode.next = head;
        head=newNode;
        if(tail==null){
            tail = newNode;
        }
    }else{
       tail.next = newNode;
        tail= newNode ;
    }

    size++;
}

int peek(){
    return  head.data;
}
    int deqeue() {
        return super.deletefirst();
    }

    @Override
    void print() {
        super.print();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
