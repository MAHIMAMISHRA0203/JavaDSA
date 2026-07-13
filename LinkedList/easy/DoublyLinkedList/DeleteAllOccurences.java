package LinkedList.easy.DoublyLinkedList;

public class DeleteAllOccurences {
    public Node delete(Node node,int target){
        Node curr=node;
        if(curr==null )return curr;
        while(curr!=null){
            if(curr.val==target) {
                if (curr.prev != null)


                    curr.prev.next = curr.next;
                else node = curr.next;
                if (curr.next != null)
                    curr.next.prev = curr.prev;

            }
            curr=curr.next;

        }
        return node;
    }
}
