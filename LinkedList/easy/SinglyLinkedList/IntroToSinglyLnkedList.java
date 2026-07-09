package LinkedList.easy.SinglyLinkedList;

class Node{
    int data; Node next;
    Node(Node next,int data){
        this.next=null;
        this.data=data;
    }
    Node (int data){
        this.data=data;
    }
}
public class IntroToSinglyLnkedList {
    Node head;
    public  void insertAtHead(int data){
        Node newNode=new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;


    }
    public void insertAtTail(int data){
        Node newNode =new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void addAtPosition(int data){

    }
    public void display(Node list){
        Node temp=list;
        while(list!=null){
            System.out.println(list.data);
            list=list.next;
        }
    }
    public void deleteAthead(){
        Node temp=head;
        head=head.next;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void delete(int val){
        if(head==null)return;
        if(head.data == val){
            head = head.next;
            return;
        }
        Node curr=head;
        Node prev=head;

        while(curr!=null){
            if(curr.data==val){
                prev.next=curr.next;
                break;
            }else {
                prev=curr;
                curr=curr.next;
            }
        }
    }
    public void length(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }
    public void search(int val){
        Node temp=head;

        while(temp!=null){
            if(temp.data==val) System.out.println("yess");
            temp=temp.next;
        }
    }

}
