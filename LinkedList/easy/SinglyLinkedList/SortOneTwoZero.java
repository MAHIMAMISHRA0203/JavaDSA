package LinkedList.easy.SinglyLinkedList;

public class SortOneTwoZero {
    public Node sort(Node node){
       Node one =new Node(-1);
        Node two =new Node(-1);
        Node zero =new Node(-1);
        Node oneTail =one;
        Node twoTail =two;
        Node zeroTail =zero;
        Node curr=node;
        while(curr!=null){
            Node next=curr;
            if(curr.data==1){
                oneTail.next=curr;
                oneTail=curr;
            }else if(curr.data==2){
                twoTail.next=curr;
                twoTail=curr;}
            else{
                zeroTail.next=curr;
                zeroTail=curr;
            }
            curr=next;
        }

        zeroTail.next = (one.next != null) ? one.next : two.next;
        oneTail.next = two.next;
        twoTail.next = null;



 return node=zero.next;
    }


}
