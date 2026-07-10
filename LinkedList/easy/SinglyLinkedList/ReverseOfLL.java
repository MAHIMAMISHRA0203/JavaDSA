package LinkedList.easy.SinglyLinkedList;

public class ReverseOfLL {
public Node reverse(Node node){

    Node prev=null;
    Node curr=node;
    while(curr!=null){
        Node temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;

    }
    return prev;
}
}
