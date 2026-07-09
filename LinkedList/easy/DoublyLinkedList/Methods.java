package LinkedList.easy.DoublyLinkedList;
class Node{
    int val;
    Node head;
    Node next;
    Node prev;
    Node (int val,Node next,Node prev){
        this.val=val;
        this.next=this.prev=null;
    }
    Node(int val){
        this.val=val;
    }
}
public class Methods {
    Node head;
    public  void insertAtHead(int data){

        Node newNode=new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;


    }
//    public void insertAtTail(int data){
//        LinkedList.easy.SinglyLinkedList.Node newNode =new LinkedList.easy.SinglyLinkedList.Node(data);
//        if(head==null) {
//            head = newNode;
//            return;
//        }
//        LinkedList.easy.SinglyLinkedList.Node temp=head;
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=newNode;
//    }
//    public void addAtPosition(int data){
//
//    }
//    public void display(LinkedList.easy.SinglyLinkedList.Node list){
//        LinkedList.easy.SinglyLinkedList.Node temp=list;
//        while(list!=null){
//            System.out.println(list.data);
//            list=list.next;
//        }
//    }
    public void deleteAthead(){
       Node temp=head;
        head=head.next;
        head.next=null;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public void reverse(){

        Node curr=head;
        if(head==null)return;
        if(head.next==null)return ;
        Node newHead=null;
        while(curr!=null){
            Node temp=curr.next;
             curr.next=curr.prev;
            curr.prev=temp;
           newHead=curr;
            curr=temp;

        }

head=newHead;

    }
//    public void delete(int val){
//        if(head==null)return;
//        if(head.data == val){
//            head = head.next;
//            return;
//        }
//        Node curr=head;
//       Node prev=head;
//
//        while(curr!=null){
//            if(curr.data==val){
//                prev.next=curr.next;
//                break;
//            }else {
//                prev=curr;
//                curr=curr.next;
//            }
//        }
//    }
//    public void length(){
//        LinkedList.easy.SinglyLinkedList.Node temp=head;
//        int count=0;
//        while(temp!=null){
//            count++;
//            temp=temp.next;
//        }
//        System.out.println(count);
//    }
//    public void search(int val){
//        LinkedList.easy.SinglyLinkedList.Node temp=head;
//
//        while(temp!=null){
//            if(temp.data==val) System.out.println("yess");
//            temp=temp.next;
//        }
//    }next
}
