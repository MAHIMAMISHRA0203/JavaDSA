package LinkedList.easy.SinglyLinkedList;

public class MainClass {

    public static void main(String[] args) {
        IntroToSinglyLnkedList list=new IntroToSinglyLnkedList();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);

        list.deleteAthead();
        list.delete(20);
        list.length();
        list.search(10);

        list.display();





    }
}
