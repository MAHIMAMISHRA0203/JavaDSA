package LinkedList.easy.SinglyLinkedList;

public class FndIntersection {
    public Node find(Node node1,Node node2){
        Node one=node1;
        Node two=node2;
        while(one!=two){
            if(one==null)
                one=node2;
            else
                one=one.next;
            if(two==null)
                    two=node1;
            else
                two=two.next;

        }
        return one;
    }
}
