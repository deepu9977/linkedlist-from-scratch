import java.util.Scanner;
import java.util.*;
public class Main {
public static void main(String[] args) {
    SinglyLL ll = new SinglyLL();
    
    ll.insertAt(2,1);
    ll.insertAt(5, 3);
    ll.insertAt(3, 7);
    ll.insertAt(1, 0);
    ll.insertAt(4, 10);
    ll.traversalList();
    ll.delete(0);
    ll.traversalList();
    ll.delete(3);
    ll.traversalList();
   
}
}

