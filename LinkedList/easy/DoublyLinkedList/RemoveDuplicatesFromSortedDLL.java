package LinkedList.easy.DoublyLinkedList;

public class RemoveDuplicatesFromSortedDLL {
    public Node delete(Node node,int target){
        Node curr=node;
        if(curr==null )return curr;
        while( curr!=null && curr.next!=null) {
            if (curr.val == curr.next.val) {
                Node dup = curr.next;
                curr.next = dup.next;
                if (dup.next != null)
                    dup.next.prev = curr;
            } else
                curr = curr.next;
        }
        return node;
    }
}
