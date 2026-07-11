package LinkedList.easy.SinglyLinkedList;

public class RemoveNthFromLast {
    public Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        // Keep a gap of n+1 nodes
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
    public Node remove(Node head, int n) {

        if (head == null)
            return null;

        int len = 0;
        Node temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Remove head
        if (n == len)
            return head.next;

        int count = len - n;   // previous node (1-based)

        temp = head;

        for (int i = 1; i < count; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
