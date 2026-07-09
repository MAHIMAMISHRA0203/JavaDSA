package LinkedList.easy.DoublyLinkedList;

public class MainMethod {
    public static void main(String[] args) {
        Methods m=new Methods();
        m.insertAtHead(10);
        m.insertAtHead(20);
        m.insertAtHead(30);
        m.insertAtHead(40);

        m.insertAtHead(50);


//        m.deleteAthead();
        m.reverse();
        m.display();
    }
}
