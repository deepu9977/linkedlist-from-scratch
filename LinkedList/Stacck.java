package LinkedList;

public class Stacck  extends  LL{

    public void push(int data) {
        super.addFirst(data);
    }


    int peek(){
        int val = head.data;
        return val;
    }
boolean isEmpty(){
        if(head==null) return true;
        return false;
}
    int pop() {
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
