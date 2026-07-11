package LinkedList.easy.SinglyLinkedList;

public class DeleteMidNode {
    public Node deleteMiddle(Node node){
        Node fast=node;
        Node slow=node;
        Node prev=null;
        if(node==null ||node.next==null)
            return null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;

        }

        prev.next=slow.next;
        return node;
    }
}
