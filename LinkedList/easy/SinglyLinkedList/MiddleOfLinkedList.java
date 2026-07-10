package LinkedList.easy.SinglyLinkedList;

public class MiddleOfLinkedList {
    public int findMiddle(Node node){
        Node fast=node;
        Node slow=node;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
}
