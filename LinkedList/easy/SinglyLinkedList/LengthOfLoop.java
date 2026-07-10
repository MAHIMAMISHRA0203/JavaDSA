package LinkedList.easy.SinglyLinkedList;

public class LengthOfLoop {
    public int find(Node node){
        Node slow=node;
        Node fast=node;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                Node start=slow.next;
                int count=1;
                while(start!=slow){
                   count++;
                    start=start.next;
                }
                return count;

            }

        }

        return -1;
    }
}
