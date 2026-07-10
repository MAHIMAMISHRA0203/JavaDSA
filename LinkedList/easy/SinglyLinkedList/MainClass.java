package LinkedList.easy.SinglyLinkedList;

import java.sql.SQLOutput;

public class MainClass {

    public static void main(String[] args) {
        IntroToSinglyLnkedList list=new IntroToSinglyLnkedList();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);




//        list.deleteAthead();

//        list.delete(20);
//        list.length();
//        list.search(10);
//        MiddleOfLinkedList m=new MiddleOfLinkedList();
//        System.out.println(m.findMiddle(list.head));

//        list.display();
//ReverseOfLL r= new ReverseOfLL();
//r.reverse(list.head);
//list.display();

        DetectALoop d=new DetectALoop();
        System.out.println(d.detectLoop(list.head));






    }
}
