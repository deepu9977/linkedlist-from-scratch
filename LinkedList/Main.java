package LinkedList;

public class Main {
    public static void main(String[] args) {


        Queuee que = new Queuee();
        que.enque(1);
        que.enque(2);
        que.enque(3);
        que.enque(4);
        que.enque(5);
        que.enque(6);
        que.enque(7);
        que.print();
        System.out.println(que.deqeue());
        que.print();
        System.out.println(que.peek());


//        Stacck stack = new Stacck();
//        stack.push(6);
//        stack.push(5);
//        stack.push(7);
//        stack.push(9);
//        stack.print();
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
//        stack.print();
//        System.out.println(stack.peek());
//        LL list = new LL();
//        list.addFirst(6);
//        list.addFirst(5);
//        list.addFirst(4);
//        list.addFirst(3);
//        list.addFirst(2);
//        list.addFirst(1);
//        list.print();
//        System.out.println(list.tail.data);



    }
}
