package LinkedList.easy.SinglyLinkedList;

public class StartingOfLoop {
    public Node find(Node node){
        Node slow=node;
        Node fast=node;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
               Node start=node;
               while(start!=slow){
                   slow=slow.next;
                   start=start.next;
               }
                return start;

            }

        }

        return null;
    }
}
