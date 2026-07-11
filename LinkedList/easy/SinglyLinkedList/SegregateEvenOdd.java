package LinkedList.easy.SinglyLinkedList;


public class SegregateEvenOdd {
    public Node segregate(Node head) {

        if (head == null || head.next == null)
            return head;
        Node first=head;
        Node second=head.next;
        while(second!=null){
            if(first.data%2!=0){
                if(second.data%2!=0){
                    first.data=first.data^second.data;
                    second.data=first.data^second.data;
                    first.data=first.data^second.data;
                }
            }
            first=first.next;
            second=second.next;
        }
        return head;
    }
}
