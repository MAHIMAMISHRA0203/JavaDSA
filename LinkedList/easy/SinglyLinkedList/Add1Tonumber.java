package LinkedList.easy.SinglyLinkedList;

public class Add1Tonumber {
    public int find(Node node){
        Node temp=node;
        int number=0;
        String s="";
        while(temp!=null){
            s+=temp.data;
            temp=temp.next;
        }
        return Integer.parseInt(s)+1;
    }
}
