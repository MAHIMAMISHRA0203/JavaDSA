package LinkedList.easy.SinglyLinkedList;

public class RotateALinkedList {
    public Node rotate(Node head,int k){
        if(k==0)return head;
        if(head==null ||head.next==null)return head;
        Node curr=head;
        Node prev=null;
        int len=1;
        while(curr.next!=null){
           len++;
           curr=curr.next;

        }
        Node tail =curr;

        k=k%len;
        if(k==0)return head;
        curr=head;
        int count=0;
        while(curr!=null){

if(count==len-k)  {
prev.next=null;
tail.next=head;
head=curr;
break;}
prev=curr;
curr=curr.next;
count++;
        }
  return head;  }
}
