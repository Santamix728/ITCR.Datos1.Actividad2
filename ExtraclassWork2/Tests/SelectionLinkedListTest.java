import LinkedList.DoubleLinkedList;
import LinkedList.Node;
import Sort.SelectionLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionLinkedListTest {
    DoubleLinkedList d=new DoubleLinkedList();
    SelectionLinkedList s=new SelectionLinkedList();


    public void SelectionTest(){
        Node head = null;
        head = d.push1(head, 2);
        head = d.push1(head, 3);
        head = d.push1(head, 1);
        head = d.push1(head, 5);
        head = d.push1(head, 4);

        System.out.println( "\nLinked list before sorting:");
        s.printList(head);


        head = s.sort(head);

        System.out.print( "\nLinked list after sorting:");
        s.printList(head);
        System.out.println("\n");

    }
    @Test
    void testselection() {






    }
}